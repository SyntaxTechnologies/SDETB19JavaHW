package e99stringmanipulationstest;



import org.example.e99.E99StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E99StringManipulationsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream systemInBackup = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(systemInBackup);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testPalindromeTrue() {
        provideInput("racecar\n");
        E99StringManipulations.main(new String[]{});
        assertEquals("In:true", outContent.toString().trim());
    }

    @Test
    public void testPalindromeFalse() {
        provideInput("hello\n");
        E99StringManipulations.main(new String[]{});
        assertEquals("In:false", outContent.toString().trim());
    }

    @Test
    public void testPalindromeWithSpaces() {
        provideInput("was it a car or a cat I saw\n");
        E99StringManipulations.main(new String[]{});
        assertEquals("In:true", outContent.toString().trim());
    }

    @Test
    public void testPalindromeWithMixedCase() {
        provideInput("Bob\n");
        E99StringManipulations.main(new String[]{});
        assertEquals("In:true", outContent.toString().trim());
    }
}

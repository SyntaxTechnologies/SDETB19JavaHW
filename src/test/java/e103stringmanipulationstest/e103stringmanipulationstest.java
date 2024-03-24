package e103stringmanipulationstest;

import org.example.e103.E103StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class e103stringmanipulationstest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testHelloWord() {
        provideInput("hello\n");
        E103StringManipulations.main(new String[]{});
        String expectedOutput = "In:h e l l o " ;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCovertWord() {
        provideInput("covert\n");
        E103StringManipulations.main(new String[]{});
        String expectedOutput = "In:c o v e r t " ;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testBlasphemyWord() {
        provideInput("blasphemy\n");
        E103StringManipulations.main(new String[]{});
        String expectedOutput = "In:b l a s p h e m y ";
        assertEquals(expectedOutput, outContent.toString());
    }
}
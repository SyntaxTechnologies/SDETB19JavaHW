package e26Test;


import org.example.e26.E26ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E26ScannerClassTest {

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
    public void testIsTeacher() {
        provideInput("Chen\n");
        E26ScannerClass.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() + "teacher" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testIsStudent() {
        provideInput("Faa\n");
        E26ScannerClass.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() + "student" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}



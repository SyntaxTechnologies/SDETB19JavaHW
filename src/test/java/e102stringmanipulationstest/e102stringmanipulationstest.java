package e102stringmanipulationstest;

import org.example.e102.E102StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class e102stringmanipulationstest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(null); // Ensure System.in is not set to a previous test's input stream
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
        provideInput("hello");
        E102StringManipulations.main(new String[]{});
        // Note the addition of System.lineSeparator() to ensure that the newline is correctly represented
        String expectedOutput = "In:" +
                "h" + System.lineSeparator() +
                "e" + System.lineSeparator() +
                "l" + System.lineSeparator() +
                "l" + System.lineSeparator() +
                "o" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testZimbabweWord() {
        provideInput("zimbabwe\n");
        E102StringManipulations.main(new String[]{});
        String expectedOutput = "In:" +
                "z" + System.lineSeparator() +
                "i" + System.lineSeparator() +
                "m" + System.lineSeparator() +
                "b" + System.lineSeparator() +
                "a" + System.lineSeparator() +
                "b" + System.lineSeparator() +
                "w" + System.lineSeparator() +
                "e" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testWowWord() {
        provideInput("wow!\n");
        E102StringManipulations.main(new String[]{});
        String expectedOutput = "In:" +
                "w" + System.lineSeparator() +
                "o" + System.lineSeparator() +
                "w" + System.lineSeparator() +
                "!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
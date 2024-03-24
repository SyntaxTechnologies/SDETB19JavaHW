package e90stringmanipulationstest;
import static org.junit.Assert.*;

import org.example.e90.E90StringManipulations;
import org.junit.*;

import java.io.*;

public class E90StringManipulationsTest{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testStringEmpty() {
        E90StringManipulations.main(new String[]{});
        String expectedOutput = "false" + System.lineSeparator() + "true" + System.lineSeparator();

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program correctly checks if the strings are empty.\n" +
                "For 'hello', the expected output is 'false', and for '', the expected output is 'true'.\n" +
                "Check your implementation for checking string emptiness.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

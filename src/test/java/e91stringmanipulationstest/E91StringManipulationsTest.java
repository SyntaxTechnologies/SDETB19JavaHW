package e91stringmanipulationstest;
import static org.junit.Assert.*;

import org.example.e91.E91StringManipulations;
import org.junit.*;
import java.io.*;

public class E91StringManipulationsTest {

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
    public void testStringCaseConversion() {
        E91StringManipulations.main(new String[]{});
        String expectedOutput = "SYNTAX TECHNOLOGIES" + System.lineSeparator() +
                "syntax technologies" + System.lineSeparator();

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program correctly converts 'syntax technologies' to uppercase and " +
                "'SYNTAX TECHNOLOGIES' to lowercase.\n" +
                "Expected output is 'SYNTAX TECHNOLOGIES' followed by 'syntax technologies'.\n" +
                "Check your implementation for converting string cases.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

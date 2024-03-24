package e89stringmanipulationstest;
import static org.junit.Assert.*;

import org.example.e89.E89StringManipulations;
import org.junit.*;

import java.io.*;

public class E89StringManipulationsTest{

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
    public void testNameCharacterCount() {
        E89StringManipulations.main(new String[]{});
        String expectedOutput = "5" + System.lineSeparator(); // Since "Timmy" has 5 characters

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected value.\n " +
                "Please ensure that your program correctly calculates the number of characters in the string 'Timmy'.\n" +
                "Expected output is '5'. Check your implementation for calculating the string length.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

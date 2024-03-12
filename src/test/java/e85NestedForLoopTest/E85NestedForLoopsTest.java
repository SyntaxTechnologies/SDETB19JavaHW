package e85NestedForLoopTest;

import org.example.e85.E85NestedForLoops;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E85NestedForLoopsTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testPatternPrinting() {
        // Redirect standard output to capture printed output
        E85NestedForLoops.main(new String[]{});

        // Get the printed output
        String printedOutput = outputStream.toString().trim();
        // Normalize the printed output line separators
        String normalizedPrintedOutput = printedOutput.replace("\r\n", "\n");

        // Define the expected output
        String expectedOutput =
                "1 2 3 4 5 6 7 \n" +
                "1 2 3 4 5 6 \n" +
                "1 2 3 4 5 \n" +
                "1 2 3 4 \n" +
                "1 2 3 \n" +
                "1 2 \n" +
                "1".replace("\n", System.lineSeparator());

        String failureMessage ="Write a program to print out the pattern:\n" +
                "\n" +
                "**Expected output:**\n" +
                "\n" +
                "```\n" +
                "1 2 3 4 5 6 7\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3 4 5 6\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3 4 5\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3 4\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3 4\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3 4 5\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3 4 5 6\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "1 2 3 4 5 6 7\n" +
                "```";

        // Compare the concatenated string with the expected output  normalizedPrintedOutput
        //assertEquals(failureMessage,expectedOutput, outputStream.toString());

        assertEquals(failureMessage,expectedOutput, normalizedPrintedOutput);
    }
}

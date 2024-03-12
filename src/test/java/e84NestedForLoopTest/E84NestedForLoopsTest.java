package e84NestedForLoopTest;

import org.example.e84.E84NestedForLoops;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E84NestedForLoopsTest {
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
        E84NestedForLoops.main(new String[]{});

        // Define the expected output
        String expectedOutput = "$$$$\n" +
                "$  $  \n" +
                "$  $  \n" +
                "$$$$"+"\n";


        String failureMessage ="**For you to do:**\n" +
                "\n" +
                "Write a program to print out the pattern:\n" +
                "\n" +
                "**Expected output:**\n" +
                "\n" +
                "```\n" +
                "$$$$\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "$  $\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "$  $\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "$$$$\n" +
                "```";
// Normalize the printed output line separators

        String normalizedPrintedOutput = outputStream.toString().replace("\r\n", "\n");
        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, normalizedPrintedOutput);
    }
}

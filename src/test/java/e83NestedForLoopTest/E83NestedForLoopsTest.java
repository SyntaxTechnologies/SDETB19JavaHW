package e83NestedForLoopTest;

import org.example.e83.E83NestedForLoops;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E83NestedForLoopsTest {
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

        E83NestedForLoops.main(new String[]{});
        // Define the expected output
        String expectedOutput = "1 2 3 4 5 6 7 8 9 10 \n" +
                "2 4 6 8 10 12 14 16 18 20 \n" +
                "3 6 9 12 15 18 21 24 27 30 \n" +
                "4 8 12 16 20 24 28 32 36 40 \n" +
                "5 10 15 20 25 30 35 40 45 50 \n";

        String failureMessage ="**For you to do:**\n" +
                "\n" +
                "Write a program to print out the pattern:\n" +
                "\n" +
                "1 2 3 4 5 6 7 8 9 10\n" +
                "\n" +
                "2 4 6 8 10 12 14 16 18 20\n" +
                "\n" +
                "3 6 9 12 15 18 21 24 27 30\n" +
                "\n" +
                "4 8 12 16 20 24 28 32 36 40\n" +
                "\n" +
                "5 10 15 20 25 30 35 40 45 50";
        // Normalize the printed output line separators

        String normalizedPrintedOutput = outputStream.toString().replace("\r\n", "\n");
        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, normalizedPrintedOutput);
    }
    }


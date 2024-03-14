package e82NestedForLoopTest;

import org.example.e82.E82NestedForLoops;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E82NestedForLoopsTest {
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
        E82NestedForLoops.main(new String[]{});

        // Define the expected output
        String expectedOutput = "syntax\nsyntax\nsyntax\nsyntax\nsyntax\nsyntax\n";

        String failureMessage ="**For you to do:**\n" +
                "\n" +
                "Write a program to print out the pattern:\n" +
                "\n" +
                "syntax\n" +
                "\n" +
                "syntax\n" +
                "\n" +
                "syntax\n" +
                "\n" +
                "syntax\n" +
                "\n" +
                "syntax\n" +
                "\n" +
                "syntax";
        String normalizedPrintedOutput = outputStream.toString().replace("\r\n", "\n");
        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, normalizedPrintedOutput);
    }
}

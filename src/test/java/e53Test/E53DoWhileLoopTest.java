package e53Test;

import org.example.e53.E53DoWhileLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E53DoWhileLoopTest {
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
    public void testDoWhileExample() {
        E53DoWhileLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "20\n18\n16\n14\n12\n10\n8\n6\n4\n2\n";

        String failureMessage = "**For you to do:**\n" +
                "\n" +
                "Using do while loop print even numbers from 20 to 1\n" +
                "\n" +
                "**Output:**\n" +
                "\n" +
                "```\n" +
                "20\n" +
                "18\n" +
                "16\n" +
                "14\n" +
                "12\n" +
                "10\n" +
                "8\n" +
                "6\n" +
                "4\n" +
                "2\n" +
                "```";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage, expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

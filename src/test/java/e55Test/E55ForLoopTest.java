package e55Test;

import org.example.e55.E55ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E55ForLoopTest {
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
    public void testForLoopExample() {
        E55ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "10\n8\n6\n4\n2\n";

        String failureMessage ="Create a for loop that prints out even numbers from 10 to 0\n" +
                "Must not include the number 0 in the output\n" +
                "\n" +
                "**Output:**\n" +
                "\n" +
                "```\n" +
                "10\n" +
                "8\n" +
                "6\n" +
                "4\n" +
                "2\n" +
                "```";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

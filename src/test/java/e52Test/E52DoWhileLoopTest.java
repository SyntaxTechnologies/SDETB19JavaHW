package e52Test;

import org.example.e52.E52DoWhileLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E52DoWhileLoopTest {
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
        E52DoWhileLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "Hello World!\nHello World!\nHello World!\nHello World!\nHello World!\n";

        String failureMessage ="**For you to do:**\n" +
                "\n" +
                "Create a do while loop that prints out \"Hello World!\" 5 times.\n" +
                "\n" +
                "**Output:**\n" +
                "\n" +
                "```\n" +
                "Hello World!\n" +
                "Hello World!\n" +
                "Hello World!\n" +
                "Hello World!\n" +
                "Hello World!\n" +
                "```";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

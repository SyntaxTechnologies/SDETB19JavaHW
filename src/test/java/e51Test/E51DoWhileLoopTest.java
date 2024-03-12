package e51Test;

import org.example.e51.E51DoWhileLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E51DoWhileLoopTest {
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
        E51DoWhileLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n";

        String failureMessage ="**For you to do:**\n" +
                "\n" +
                "Using do while loop print numbers from 10 to 20\n" +
                "Must not include the number 20 in the output\n" +
                "\n" +
                "\n" +
                "**Output:**\n" +
                "\n" +
                "```\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "15\n" +
                "16\n" +
                "17\n" +
                "18\n" +
                "19\n" +
                "```";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

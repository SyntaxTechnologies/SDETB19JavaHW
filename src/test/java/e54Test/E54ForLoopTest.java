package e54Test;

import org.example.e54.E54ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E54ForLoopTest {
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
        E54ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n";

        String failureMessage ="Create a for loop that prints out numbers from 0 to 12\n" +
                "Must not include the number 12 in the output\n" +
                "\n" +
                "**Output:**\n" +
                "\n" +
                "```\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "11\n" +
                "\n" +
                "```";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

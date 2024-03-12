package e57Test;

import org.example.e57.E57ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E57ForLoopTest {
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
        E57ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "5\n7\n9\n11\n13\n15\n17\n19\n21\n";

        String failureMessage ="Create a for loop that prints out odd numbers from 5 to 22\n" +
                "Must not include the number 22 in the output\n" +
                "Expected Output:\n" +
                "5\n" +
                "7\n" +
                "9\n" +
                "11\n" +
                "13\n" +
                "15\n" +
                "17\n" +
                "19\n" +
                "21";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

package e65Test;

import org.example.e65.E65ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E65ForLoopTest {
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
    public void testNumberSeriesPrinting() {
        // Prepare input for Scanner
        String userInput = "7"; // Sample input
        int x = Integer.parseInt(userInput);
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        // Redirect standard output to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        E65ForLoop.main(null);

        // Get the printed output
        String printedOutput = outputStream.toString().trim();

        // Define the expected output based on the given input
        StringBuilder expectedOutput = new StringBuilder();



        for (int i = x - 1; i >= 0; i--) {
            expectedOutput.append(i).append(" ");
        }
        // Verify the printed output matches the expected output
        assertEquals(expectedOutput.toString().trim(), printedOutput);
        String failureMessage ="Given the following inputs:\n" +
                "\n" +
                "```\n" +
                "int x;\n" +
                "```\n" +
                "\n" +
                "Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.\n" +
                "\n" +
                "Sample input/outputs:\n" +
                "\n" +
                "```\n" +
                "In: 7\n" +
                "6 5 4 3 2 1 0\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "In: 12\n" +
                "11 10 9 8 7 6 5 4 3 2 1 0\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "In: 20\n" +
                "19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0\n" +
                "```";

        // Compare the concatenated string with the expected output
        //assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

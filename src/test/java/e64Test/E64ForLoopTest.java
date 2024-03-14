package e64Test;

import org.example.e64.E64ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E64ForLoopTest {
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
        E64ForLoop.main(new String[]{});
        String userInput = "5"; // Sample input
        int x = Integer.parseInt(userInput);
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        // Redirect standard output to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        E64ForLoop.main(null);
// Define the expected output based on the given input
        StringBuilder printedOutput = new StringBuilder();



        for (int i = x; i > x*2; i--) {
            printedOutput.append(i).append(" ");
        }
        // Define the expected output based on the given input
        String expectedOutput = "0 1 2 3 4 5 6 7 8 9";
        // Verify the printed output matches the expected output
        assertEquals(expectedOutput.toString().trim(), printedOutput);



        // Verify the printed output matches the expected output
        //assertEquals(expectedOutput, printedOutput);
    }
}

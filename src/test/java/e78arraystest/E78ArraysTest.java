package e78arraystest;
import static org.junit.Assert.*;

import org.example.e78.E78Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E78ArraysTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintSumOf2DArray() {
        int[][] inputArray = {{-1, -2, -3}, {-1, -2, -3}}; // Example array
        E78Arrays.main(inputArray); // Replace with your actual method call

        String expectedOutput = "-9" + System.lineSeparator();
        String failureMessage = "The output does not match the expected sum of all elements in the 2D array.\n" +
                "Please ensure that your program correctly calculates and prints the sum.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

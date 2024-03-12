package e80arraystest;
import static org.junit.Assert.*;

import org.example.e80.E80Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E80ArraysTest {

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
    public void testCountNegativeOddNumbers() {
        int[] inputArray = {1, -3, 4, -5, -7, 8, 10}; // Example array
        E80Arrays.main(inputArray); // Replace with your actual method call

        String expectedOutput = "3";
        String failureMessage = "The output does not match the expected number of negative odd elements.\n" +
                "Please ensure that your program correctly counts the number of elements that are both negative and odd.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

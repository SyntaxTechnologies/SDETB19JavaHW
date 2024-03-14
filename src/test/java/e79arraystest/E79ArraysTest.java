package e79arraystest;
import static org.junit.Assert.*;

import org.example.e79.E79Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E79ArraysTest {

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
    public void testRowSums() {
        int[][] inputArray = {{1, 1, 2}, {3, 1, 2}, {3, 5, 3}, {0, 1, 2}};
        E79Arrays.main(inputArray); // Replace with your actual method call

        String expectedOutput = "4" + System.lineSeparator() +
                "6" + System.lineSeparator() +
                "11" + System.lineSeparator() +
                "3" + System.lineSeparator();
        String failureMessage = "The output does not match the expected row sums.\n" +
                "Please ensure that your program correctly calculates the sum of each row in the 2D array and prints it.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

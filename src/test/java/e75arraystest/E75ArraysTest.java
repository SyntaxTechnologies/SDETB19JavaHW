package e75arraystest;
import static org.junit.Assert.*;

import org.example.e75.E75Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E75ArraysTest {

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
    public void testPrint2DArray() {
        double[][] inputArray = {{1.4, 2.0, 3.3, 2.0}, {4.0, 1.5, 6.1, 1.0}, {1.2, 3.1, 4.0, 1.6}};
        E75Arrays.main(inputArray);

        StringBuilder expectedOutputBuilder = new StringBuilder();
        for (double[] row : inputArray) {
            for (double value : row) {
                expectedOutputBuilder.append(value).append(" ");
            }
            expectedOutputBuilder.append(System.lineSeparator());
        }
        String expectedOutput = expectedOutputBuilder.toString();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints each element of the 2D array correctly.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

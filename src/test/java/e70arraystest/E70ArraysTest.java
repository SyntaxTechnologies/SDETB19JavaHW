package e70arraystest;
import static org.junit.Assert.*;

import org.example.e70.E70Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E70ArraysTest {

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
    public void testPrintYears() {
        E70Arrays.main(new String[]{});
        StringBuilder expectedOutputBuilder = new StringBuilder();
        for (int year = 2010; year <= 2020; year++) {
            expectedOutputBuilder.append(year).append(System.lineSeparator());
        }
        String expectedOutput = expectedOutputBuilder.toString();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints the years from 2010 to 2020, each on a new line.\n" +
                "Check your array initialization, loop, and print statements.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

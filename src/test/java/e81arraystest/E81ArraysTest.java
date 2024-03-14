package e81arraystest;
import static org.junit.Assert.*;

import org.example.e80.E80Arrays;
import org.example.e81.E81Arrays;
import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E81ArraysTest {

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
    public void testSumEvenIndexEvenRow() {
        E81Arrays.main(new String[]{});
        String expectedOutput = "-4"+ System.lineSeparator();
        String failureMessage = "The output does not match the expected sum of numbers on even index and even row.\n" +
                "Please ensure that your program correctly calculates and prints the sum.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

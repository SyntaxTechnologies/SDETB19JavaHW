package e71arraystest;
import static org.junit.Assert.*;

import org.example.e71.E71Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E71ArraysTest {

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
    public void testExtractedValues() {
        E71Arrays.main(new String[]{});
        String expectedOutput = "78 55 77 ";

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints '78 55 77 ' in one line.\n" +
                "Check your for loop's starting point and increment value to extract the correct elements from the array.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

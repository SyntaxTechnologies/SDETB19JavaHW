package e69arraystest;
import static org.junit.Assert.*;

import org.example.e69.E69Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E69ArraysTest {

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
    public void testPrintStringArray() {
        E69Arrays.main(new String[]{});
        String expectedOutput = "This is array of strings " ;

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints 'This is array of strings' in one line.\n" +
                "Check your array processing logic and print statements.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}

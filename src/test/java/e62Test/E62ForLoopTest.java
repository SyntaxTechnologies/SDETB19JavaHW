package e62Test;

import org.example.e62.E62ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E62ForLoopTest {
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
    public void testNumberPrintingExcludingFiveAndSix() {
        E62ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "1\n2\n3\n4\n7\n8\n9\n10\n";
        String failureMessage ="Using for loop Print 1 to 10 Numbers except 5 and 6\n" +
                "Expected Output:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10";

        // Compare the concatenated string with the expected output
        String normalizedPrintedOutput = outputStream.toString().replace("\r\n", "\n");
        assertEquals(failureMessage,expectedOutput, normalizedPrintedOutput);
    }

}

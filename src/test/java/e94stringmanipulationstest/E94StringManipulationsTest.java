package e94stringmanipulationstest;

import org.example.e94.E94StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E94StringManipulationsTest {

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
    public void testSubstringRetrieval() {
        E94StringManipulations.main(new String[]{});

        // Expected outputs are separated by the system's line separator
        String expectedOutput = "classes at Syntax" + System.lineSeparator() +
                "I love Java" + System.lineSeparator();

        // Assert that the actual output matches the expected output
        assertEquals("The output did not match the expected values for substring retrieval.", expectedOutput, outContent.toString());
    }
}

package e93stringmanipulationstest;



import org.example.e93.E93StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E93StringManipulationsTest {

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
    public void testStringIndexOf() {
        E93StringManipulations.main(new String[]{});

        // Expected outputs are separated by the system's line separator
        String expectedOutput = "4" + System.lineSeparator() +
                "11" + System.lineSeparator() +
                "6" + System.lineSeparator() +
                "-1" + System.lineSeparator();

        // Assert that the actual output matches the expected output
        assertEquals("The output did not match the expected values for string index of.", expectedOutput, outContent.toString());
    }
}

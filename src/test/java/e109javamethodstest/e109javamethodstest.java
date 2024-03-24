package e109javamethodstest;

import org.example.e109.E109JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class e109javamethodstest {

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
    public void testNewLineMethodCalls() {
        String[] args = {}; // No arguments needed for this test
        E109JavaMethods.main(args);
        String expectedOutput = "newLine method implementation" + System.lineSeparator() +
                "newLine method implementation" + System.lineSeparator() +
                "newLine method implementation" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}


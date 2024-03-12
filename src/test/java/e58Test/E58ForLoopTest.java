package e58Test;

import org.example.e58.E58ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E58ForLoopTest {
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
    public void testForLoopExample() {
        E58ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "Good Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\nGood Morning!\n";

        String failureMessage ="Using for loop print \"Good Morning!\" 20 times";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

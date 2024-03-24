package e104stringmanipulationstest;

import org.example.e104.E104StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class e104stringmanipulationstest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testNamesOutput() {
        String input = "John\nJane\nJimmy\nMike\nEmily\n";
        provideInput(input);
        E104StringManipulations.main(new String[]{});

        // Normalize line endings to "\n" for the comparison
        String actualOutputNormalized = outContent.toString().replace(System.lineSeparator(), "\n");

        String expectedOutput = "Joh\nJan\nJim\nMik\nEmi\n";
        assertEquals(expectedOutput, actualOutputNormalized);
    }
}
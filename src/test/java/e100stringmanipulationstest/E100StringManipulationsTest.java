package e100stringmanipulationstest;


import org.example.e100.E100StringManipulations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E100StringManipulationsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(new ByteArrayInputStream("manhattan".getBytes()));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testReverseStringManhattan() {
        E100StringManipulations.main(new String[]{});
        String expectedOutput = "In:nattahnam" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    // Add additional test methods for different input strings
    @Test
    public void testReverseStringProcessor() {
        System.setIn(new ByteArrayInputStream("processor".getBytes()));
        E100StringManipulations.main(new String[]{});
        String expectedOutput = "In:rossecorp" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testReverseStringRacecar() {
        System.setIn(new ByteArrayInputStream("racecar".getBytes()));
        E100StringManipulations.main(new String[]{});
        String expectedOutput = "In:racecar" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

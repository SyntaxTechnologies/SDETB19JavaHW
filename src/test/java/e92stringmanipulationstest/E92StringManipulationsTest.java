package e92stringmanipulationstest;


import org.example.e92.E92StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E92StringManipulationsTest {

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
    public void testStringEndings() {
        E92StringManipulations.main(new String[]{});
        String[] lines = outContent.toString().split(System.lineSeparator());
        String[] expectedOutputs = {"true", "false", "false", "true"};

        for (int i = 0; i < expectedOutputs.length; i++) {
            assertEquals("Output for check " + (i + 1) + " did not match expected.",
                    expectedOutputs[i],
                    lines[i]);
        }}}

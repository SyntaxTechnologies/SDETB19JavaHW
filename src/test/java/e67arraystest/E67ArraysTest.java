package e67arraystest;

import org.example.e67.E67Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E67ArraysTest {
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
    public void testEvenIndexArrayValues() {
        E67Arrays.main(new String[]{});

        // It's crucial that the expected output matches exactly, including spaces
        String expectedOutput = "45 12 55 23 88"; // Ensure this is exactly what your program outputs

        // Use trim() to remove leading and trailing spaces
        String actualOutput = outputStream.toString().trim();

        assertEquals("The program should print the values stored at even indices including 0.", expectedOutput, actualOutput);
    }
}
package e74arraystest;


import org.example.e74.E74Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E74ArraysTest {

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
    public void testMultipliedOutput() {
        // Providing input values: 1, 2, 3, 4, 5
        provideInput("1\n2\n3\n4\n5\n");

        E74Arrays.main(new String[]{});

        // Building the expected output string
        String expectedOutput = "10" + System.lineSeparator() +
                "20" + System.lineSeparator() +
                "30" + System.lineSeparator() +
                "40" + System.lineSeparator() +
                "50" + System.lineSeparator();

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}

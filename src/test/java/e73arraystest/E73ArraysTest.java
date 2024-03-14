package e73arraystest;

import org.example.e73.E73Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E73ArraysTest {

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
    public void testReverseOrderOutput() {
        // Provide the input numbers 1, 2, 3, 4, 5
        provideInput("1\n2\n3\n4\n5\n");

        E73Arrays.main(new String[]{});

        // Build the expected output
        String expectedOutput = "5" + System.lineSeparator() +
                "4" + System.lineSeparator() +
                "3" + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "1" + System.lineSeparator();

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}

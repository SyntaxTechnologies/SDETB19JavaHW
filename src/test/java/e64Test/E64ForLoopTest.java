package e64Test;

import org.example.e64.E64ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E64ForLoopTest {
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
    public void testNumberSequencePositive() {
        provideInput("5\n");
        E64ForLoop.main(new String[]{});
        String expectedOutput = "Int:0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testNumberSequenceLargePositive() {
        provideInput("8\n");
        E64ForLoop.main(new String[]{});
        String expectedOutput = "Int:0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testNumberSequenceNegative() {
        provideInput("-5\n");
        E64ForLoop.main(new String[]{});
        assertEquals("Int:", outContent.toString().trim());
    }

    // Additional tests can be added here to cover more scenarios
}
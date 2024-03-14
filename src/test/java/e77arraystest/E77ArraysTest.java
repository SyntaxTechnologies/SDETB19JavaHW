package e77arraystest;
import static org.junit.Assert.*;

import org.example.e77.E77Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E77ArraysTest {

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
    public void testMaxValue() {
        E77Arrays.main(new String[]{}); // Execute the main method to test
        String expectedOutput = "8" ;
        assertEquals(expectedOutput, outContent.toString());
    }
}
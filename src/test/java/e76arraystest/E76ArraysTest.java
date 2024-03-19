package e76arraystest;
import static org.junit.Assert.*;

import org.example.e76.E76Arrays;
import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E76ArraysTest {

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
    public void testArrayDoubling() {
        E76Arrays.main(new String[]{});
        String expectedOutput = "2.8 4.0 6.6 4.0 " + System.lineSeparator() +
                "8.0 3.0 12.2 2.0 " + System.lineSeparator() +
                "2.4 6.2 8.0 3.2 " + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
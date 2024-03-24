package e95stringmanipulationstest;
import org.example.e95.E95StringManipulations;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E95StringManipulationsTest {

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
    public void testFirstThreeLettersExtraction() {
        String input = "banana";
        provideInput(input); // Simulate user input
        E95StringManipulations.main(new String[]{});

        String expectedOutput = "The first 3 letters of " + input + " is ban" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    private void provideInput(String data) {
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        System.setIn(input);
    }
}

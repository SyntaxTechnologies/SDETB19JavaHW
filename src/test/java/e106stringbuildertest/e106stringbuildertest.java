package e106stringbuildertest;

import org.example.e106.E106StringBuilder;
import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;
        import static org.junit.Assert.assertEquals;

public class e106stringbuildertest {

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
    public void testAppendAndUppercase() {
        String[] args = {}; // No arguments needed for this test
        E106StringBuilder.main(args);
        String expectedOutput = "HELLO WORLD" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

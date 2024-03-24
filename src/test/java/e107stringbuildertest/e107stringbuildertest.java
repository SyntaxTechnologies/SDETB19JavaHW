package e107stringbuildertest;

import org.example.e107.E107StringBuilder;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;
        import static org.junit.Assert.assertEquals;

public class e107stringbuildertest {

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
    public void testStringReverse() {
        String[] args = {"Hello Friends"};
        E107StringBuilder.main(args);
        String expectedOutput = "sdneirF olleH" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

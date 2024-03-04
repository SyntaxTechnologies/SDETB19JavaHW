package e5creatingvariablesandprintingtest;

import org.example.e5.E5CreatingVariablesAndPrinting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;


public class E5CreatingVariablesAndPrintingTest {
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
    public void testNameAgeIq() {
        E5CreatingVariablesAndPrinting.main(new String[]{});
        String expectedOutput = "Chen" + System.lineSeparator() +
                "5050";
        assertEquals(expectedOutput, outContent.toString());
    }
}
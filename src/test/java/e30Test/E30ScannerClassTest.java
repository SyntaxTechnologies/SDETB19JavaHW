package e30Test;

import org.example.e30.E30ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E30ScannerClassTest {

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
    public void testJanuary() {
        provideInput("1\n");
        E30ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter month number" + System.lineSeparator() + "January" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    // Repeat for other months...

    @Test
    public void testDecember() {
        provideInput("12\n");
        E30ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter month number" + System.lineSeparator() + "December" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testInvalidMonth() {
        provideInput("13\n");
        E30ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter month number" + System.lineSeparator() + "Invalid" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}


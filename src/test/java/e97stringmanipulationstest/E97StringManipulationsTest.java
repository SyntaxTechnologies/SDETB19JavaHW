package e97stringmanipulationstest;
import static org.junit.Assert.*;

import org.example.e97.E97StringManipulations;
import org.junit.*;
import java.io.*;
import java.util.Scanner;

public class E97StringManipulationsTest {

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

    @Test
    public void testChromeBrowser() {
        provideInput("Chrome");
        E97StringManipulations.main(new String[]{});
        String expectedOutput ="Enter the browser name to proceed further with execution" + System.lineSeparator()+ "Proceed with Chrome browser" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testFirefoxBrowser() {
        provideInput("firefox");
        E97StringManipulations.main(new String[]{});
        String expectedOutput ="Enter the browser name to proceed further with execution" + System.lineSeparator()+ "Proceed with Firefox browser" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testIEBrowser() {
        provideInput("ie");
        E97StringManipulations.main(new String[]{});
        String expectedOutput = "Enter the browser name to proceed further with execution" + System.lineSeparator()+ "Proceed with IE browser" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testInvalidBrowser() {
        provideInput("Safari");
        E97StringManipulations.main(new String[]{});
        String expectedOutput = "Enter the browser name to proceed further with execution" + System.lineSeparator()+ "Invalid browser" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    private void provideInput(String data) {
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        System.setIn(input);
    }
}

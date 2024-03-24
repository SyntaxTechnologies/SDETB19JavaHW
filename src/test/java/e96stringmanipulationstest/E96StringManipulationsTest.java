package e96stringmanipulationstest;
import static org.junit.Assert.*;

import org.example.e96.E96StringManipulations;
import org.junit.*;
import java.io.*;
import java.util.Scanner;

public class E96StringManipulationsTest {

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
    public void testJavaLanguage() {
        provideInput("Java");
        E96StringManipulations.main(new String[]{});
        String expectedOutput = "Enter any programming language"+ System.lineSeparator() +"Java is a programming language" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCLanguage() {
        provideInput("C");
        E96StringManipulations.main(new String[]{});
        String expectedOutput = "Enter any programming language"+ System.lineSeparator()+"C is a procedural programming language" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCPlusPlusLanguage() {
        provideInput("C++");
        E96StringManipulations.main(new String[]{});
        String expectedOutput = "Enter any programming language"+ System.lineSeparator()+"C++ is a middle-level programming language" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testOtherLanguage() {
        provideInput("Python");
        E96StringManipulations.main(new String[]{});
        String expectedOutput = "Enter any programming language"+ System.lineSeparator()+"Doesn't match any programming language" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    private void provideInput(String data) {
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        System.setIn(input);
    }
}

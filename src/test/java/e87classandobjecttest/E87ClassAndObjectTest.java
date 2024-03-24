package e87classandobjecttest;
import org.example.e87.E87ClassAndObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E87ClassAndObjectTest {

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
    public void testCarAttributesPrinting() {
        String[] args = {}; // Assuming the main method doesn't use args for input
        E87ClassAndObject.main(args); // This will execute the main method of the Main class
        String expectedOutput = "Car color is Black and car year is 2019 and car model is BMW" + System.lineSeparator() +
                "Car color is White and car year is 2018 and car model is Toyota" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

package e88classandobjecttest;

import org.example.e88.E88ClassAndObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E88ClassAndObjectTest {

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
    public void testDogBehaviors() {
        String[] args = {}; // Assuming the main method doesn't use args for input
        E88ClassAndObject.main(args); // This will execute the main method of the Main class
        String expectedOutput =
                "Husky can bark" + System.lineSeparator() +
                        "Husky can run" + System.lineSeparator() +
                        "Husky can play" + System.lineSeparator() +
                        "Bulldog can bark" + System.lineSeparator() +
                        "Bulldog can run" + System.lineSeparator() +
                        "Bulldog can play" + System.lineSeparator() +
                        "Labrador can bark" + System.lineSeparator() +
                        "Labrador can run" + System.lineSeparator() +
                        "Labrador can play" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

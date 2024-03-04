package e11airthmeticoperationstest;
import org.example.e11.E11AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E11AirthmeticOperationsTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testCalculatePerimeterAndArea() {
        E11AirthmeticOperations.main(new String[]{});

        // Define the expected output
        String expectedOutput = "The perimeter of a rectangle with width 5 and height 8 is equals to 26 and the area equals to 40"+ System.lineSeparator();
        // Adding a detailed failure message
        String failureMessage = "The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __";

        assertEquals(failureMessage, expectedOutput, outputStream.toString());

    }
}

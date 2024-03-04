package e9airthmeticoperationstest;
import org.example.e9.E9AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E9AirthmeticOperationsTest {
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
    public void testFloatMultiplication() {
        E9AirthmeticOperations.main(new String[]{});
        // Define the expected output
        String expectedOutput = "The multiplication of 8.2 with itself is equal to 67.24"+System.lineSeparator();;
        String failureMessage ="Create a float data type variable and assign a value of  8.2 to it\n" +
                "Multiply the value by itself and print the result.\n" +
                "**Output:**\n" +
                "The multiplication of ___ with itself is equal to ____";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }

}

package e12Test;

import org.example.e12.E12AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E12AirthmeticOperationsTest {
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
    public void testArithmeticOperations() {

        E12AirthmeticOperations.main(new String[]{});

        // Define the expected output
        String expectedOutput = "The result of arithmetic operations is equal to "+" "+1;

        String failureMessage ="For you to do:\n" +
                "Add num1 and num2\n" +
                "Divide the result by num3\n" +
                "Subtract num4 from that result\n" +
                "Instructions: Please use variables to assign the result of arithmetic operations\n" +
                "Output:\n" +
                "The result of arithmetic operations is equal to ___";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

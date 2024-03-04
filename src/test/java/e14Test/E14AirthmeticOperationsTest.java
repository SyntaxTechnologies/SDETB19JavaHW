package e14Test;

import org.example.e14.E14AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E14AirthmeticOperationsTest {
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
        E14AirthmeticOperations.main(new String[]{});

        // Define the expected output
        String expectedOutput = "14 modded by 6 is 2"+ System.lineSeparator()+  "14 modded by 6 is 2"+System.lineSeparator();

        String failureMessage ="- Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable\n" +
                "- Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable\n" +
                "- Print the following statement:\n" +
                "**_______ modded by _______ is ______**\n" +
                "result2           result1    blank3\n" +
                "where blank3 is the remainder of result1 into result2";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

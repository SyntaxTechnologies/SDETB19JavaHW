package e15Test;

import org.example.e15.E15AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E15AirthmeticOperationsTest {
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
    public void testModuloOperation() {
        E15AirthmeticOperations.main(new String[]{});

        // Define the expected output
        String expectedOutput = "0"+ System.lineSeparator();

        String failureMessage ="For you to do:\n" +
                "Print the results of 14 mod 2.\n" +
                "Expected Output:\n" +
                "0";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

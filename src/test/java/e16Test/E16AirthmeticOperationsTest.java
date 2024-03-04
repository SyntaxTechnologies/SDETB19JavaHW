package e16Test;

import org.example.e16.E16AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E16AirthmeticOperationsTest {
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
        E16AirthmeticOperations.main(new String[]{});

        // Define the expected output
        String expectedOutput = "1"+ System.lineSeparator();

        String failureMessage ="For you to do:\n" +
                "Print the result of 29 mod 4\n" +
                "Output:\n" +
                "1";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

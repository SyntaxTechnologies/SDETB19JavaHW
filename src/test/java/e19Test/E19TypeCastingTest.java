package e19Test;

import org.example.e19.E19TypeCasting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E19TypeCastingTest {
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
    public void testDoubleToIntConversion() {

        E19TypeCasting.main(new String[]{});
        // Define the expected output
        String expectedOutput = "100"+ System.lineSeparator();

        String failureMessage ="Write a program to convert double 100.50 into int type\n" +
                "Expected Output:\n" +
                "100";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

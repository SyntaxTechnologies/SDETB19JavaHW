package e18Test;

import org.example.e18.E18TypeCasting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E18TypeCastingTest {
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
    public void testDoubleToLongConversion() {

        E18TypeCasting.main(new String[]{});
        // Define the expected output

        //long expectedOutput = 500;
        String expectedOutput="500";

        String failureMessage ="Write a program to convert double 500.4444 into long.\n" +
                "Expected Output:\n" +
                "500";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

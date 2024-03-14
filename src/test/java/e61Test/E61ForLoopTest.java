package e61Test;

import org.example.e61.E61ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E61ForLoopTest {
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
    public void testMultiplicationTable() {
        E61ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "3*1=3\n" +
                "3*2=6\n" +
                "3*3=9\n" +
                "3*4=12\n" +
                "3*5=15\n" +
                "3*6=18\n" +
                "3*7=21\n" +
                "3*8=24\n" +
                "3*9=27\n" +
                "3*10=30\n";

        String failureMessage ="Write a program that uses for loop to prints multiplication of number 3 from 1 to 10\n" +
                "Expected Output:\n" +
                "3*1=3\n" +
                "3*2=6\n" +
                "3*3=9\n" +
                "3*4=12\n" +
                "3*5=15\n" +
                "3*6=18\n" +
                "3*7=21\n" +
                "3*8=24\n" +
                "3*9=27\n" +
                "3*10=30";
// Normalize the printed output line separators

        String normalizedPrintedOutput = outputStream.toString().replace("\r\n", "\n");
        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, normalizedPrintedOutput);
    }
}

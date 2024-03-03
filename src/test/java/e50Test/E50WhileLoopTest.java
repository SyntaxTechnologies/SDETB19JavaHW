package e50Test;

import org.example.e50.E50WhileLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E50WhileLoopTest {
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
    public void testIncrement() {
        E50WhileLoop.main(new String[]{});
        // Define the expected output
        StringBuilder expectedOutput = new StringBuilder();
        for (int j = 7; j <= 98; j += 7) {
            expectedOutput.append(j).append("\n");
        }
        String failureMessage ="Step 1: Initialize the i value as int i=7.\n" +
                "Step 2: Write a program to print a sequence of numbers starting from 7 to 98.\n" +
                "Output:\n" +
                "7\n" +
                "14\n" +
                "21\n" +
                "28\n" +
                "35\n" +
                "42\n" +
                "49\n" +
                "56\n" +
                "63\n" +
                "70\n" +
                "77\n" +
                "84\n" +
                "91\n" +
                "98";
        // Verify the printed output matches the expected output
        assertEquals(failureMessage,expectedOutput.toString(), outputStream.toString().replace("\r\n", "\n"));
    }
}

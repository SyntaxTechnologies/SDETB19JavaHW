package e5creatingvariablesandprintingtest;

import org.example.e5.E5CreatingVariablesAndPrinting;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class E5CreatingVariablesAndPrintingTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Test
    public void testVariablePrinting() {

        System.setOut(new PrintStream(outputStream));
        E5CreatingVariablesAndPrinting.main(new String[]{});
/*
            // Create a String variable "name" and assign a value of "Chen" to it
            String name = "Chen";

            // Create an integer variable "age" and assign a value of 50 to it
            int age = 50;

            // Create an integer variable "iq" and assign the value of age to it
            int iq = age;

            // Print the value of "name"
            System.out.println(name);

            // Print the value of "age" and the value of "iq" on the same line
            System.out.print(age);
            System.out.print(iq);
*/
        System.setOut(originalOut);
        String printedOutput = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "Chen"+ System.lineSeparator() + "5050";


        // Compare the actual output with the expected output
        assertEquals(expectedOutput, printedOutput);
    }
}
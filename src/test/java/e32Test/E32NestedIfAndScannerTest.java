package e32Test;

import org.example.e32.E32NestedIfAndScanner;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class E32NestedIfAndScannerTest {
    @Test
    public void testManOver25() {
        // Prepare input data for the test
        String input = "M\n30\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect System.out to capture the output
        InputStream originalIn = System.in;
        final StringBuffer output = new StringBuffer();
        System.setOut(new java.io.PrintStream(System.out) {
            public void println(String msg) {
                output.append(msg).append("\n");
            }
        });

        // Call the main method of the class
        E32NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMsg ="If age is above 25, then check if a user entered F then the output should be \"Woman\" otherwise it should say \"Man\"";
        String expectedOutput = "Please enter your gender: M or F\nPlease enter your age\nMan\n";
        assertEquals(failureMsg , expectedOutput, output.toString());
    }

    @Test
    public void testGirlUnder25() {
        // Prepare input data for the test
        String input = "F\n20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect System.out to capture the output
        InputStream originalIn = System.in;
        final StringBuffer output = new StringBuffer();
        System.setOut(new java.io.PrintStream(System.out) {
            public void println(String msg) {
                output.append(msg).append("\n");
            }
        });

        // Call the main method of the class
        E32NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMsg = "If age is below 25, then check if a user entered F then the output should be \"Girl\" otherwise it should say \"Boy\"";
        String expectedOutput = "Please enter your gender: M or F\nPlease enter your age\nGirl\n";
        assertEquals(failureMsg,expectedOutput, output.toString());
    }
}

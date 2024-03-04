package e33Test;

import org.example.e33.E33NestedIfAndScanner;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class E33NestedIfAndScannerTest {
    @Test
    public void testEvenNumberJustRight() {
        // Prepare input data for the test
        String input = "10\n";
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
        E33NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMessage ="Please enter a number\nValue is even\nEven value is just right\n";
        String expectedOutput = "Please enter a number\nValue is even\nEven value is just right\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void testOddNumberJustRight() {
        // Prepare input data for the test
        String input = "15\n";
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
        E33NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMessage ="Please enter a number\nValue is odd\nOdd value is just right\n";
        String expectedOutput = "Please enter a number\nValue is odd\nOdd value is just right\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void testEvenNumberLarge() {
        // Prepare input data for the test
        String input = "2000\n";
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
        E33NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMessage ="Please enter a number\nValue is even\nEven value is large\n";
        String expectedOutput = "Please enter a number\nValue is even\nEven value is large\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void testOddNumberLarge() {
        // Prepare input data for the test
        String input = "1501\n";
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
        E33NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMessage ="Please enter a number\nValue is odd\nOdd value is large\n";
        String expectedOutput = "Please enter a number\nValue is odd\nOdd value is large\n";
        assertEquals(failureMessage,expectedOutput, output.toString());
    }
}

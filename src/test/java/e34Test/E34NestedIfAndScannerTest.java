package e34Test;

import org.example.e34.E34NestedIfAndScanner;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class E34NestedIfAndScannerTest {
    @Test
    public void testLargestNumberFirst() {
        // Prepare input data for the test
        String input = "10\n5\n3\n";
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
        E34NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String expectedOutput = "Please enter 3 distinct numbers\nThe largest number is 10\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void testLargestNumberSecond() {
        // Prepare input data for the test
        String input = "5\n10\n3\n";
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
        E34NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String expectedOutput = "Please enter 3 distinct numbers\nThe largest number is 10\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void testLargestNumberThird() {
        // Prepare input data for the test
        String input = "3\n5\n10\n";
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
        E34NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String expectedOutput = "Please enter 3 distinct numbers\nThe largest number is 10\n";
        assertEquals(expectedOutput, output.toString());
    }
}

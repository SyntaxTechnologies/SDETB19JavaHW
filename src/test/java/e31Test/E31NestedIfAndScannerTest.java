package e31Test;

import org.example.e31.E31NestedIfAndScanner;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class E31NestedIfAndScannerTest {

    @Test
    public void testSunnyDayBeach() {
        // Prepare input data for the test
        String input = "true\n90\n";
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
        E31NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMsg ="Is it sunny outside?\n" +
                "It is a sunny day, I should go somewhere!\n" +
                "What is the temperature outside?\n" +
                "I am going to the beach!";
        String expectedOutput = "Is it sunny outside?\nIt is a sunny day, I should go somewhere!\nWhat is the temperature outside?\nI am going to the beach\n";
        assertEquals(failureMsg,expectedOutput, output.toString());
    }

    @Test
    public void testSunnyDayPark() {
        // Prepare input data for the test
        String input = "true\n80\n";
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
        E31NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMsg ="Is it sunny outside?\n" +
                "It is a sunny day, I should go somewhere!\n" +
                "What is the temperature outside?\n" +
                "I am going to the park!";
        String expectedOutput = "Is it sunny outside?\nIt is a sunny day, I should go somewhere!\nWhat is the temperature outside?\nI am going to the park\n";
        assertEquals(failureMsg,expectedOutput, output.toString());
    }

    @Test
    public void testNotSunnyDay() {
        // Prepare input data for the test
        String input = "false\n";
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
        E31NestedIfAndScanner.main(new String[0]);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String failureMsg ="Is it sunny outside?\n" +
                "I stay home and practice Java!";
        String expectedOutput = "Is it sunny outside?\nI stay home and practice Java\n";
        assertEquals(failureMsg,expectedOutput, output.toString());
    }
}

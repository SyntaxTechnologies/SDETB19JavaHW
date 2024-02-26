package e22Test;

import org.example.e22.E22ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E22ScannerClassTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("25\n".getBytes());
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    @Test
    public void testUserInput() {
        // Prepare input data for the test
        String input = "John\n1234567890\n25\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect System.out to capture the output
        InputStream originalIn = System.in;
        String[] args = {};
        final StringBuffer output = new StringBuffer();
        System.setOut(new PrintStream(System.out) {
            public void println(String msg) {
                output.append(msg).append("\n");
            }
        });

        // Call the main method of the class
        E22ScannerClass.main(args);

        // Restore original System.in and get the captured output
        System.setIn(originalIn);
        String expectedOutput = "Enter your name\nEnter your mobile number\nEnter your age\nYour name is John, your age is 25 and your mobile number is 1234567890\n";
        String failureMessage ="Write a program to take username, age and mobile number\n" +
                "First Output: \"Enter your name\"\n" +
                "Second Output: \"Enter your mobile number\" (please use xxx-xxx-xxxx format)\n" +
                "Third Output: \"Enter your age\"\n";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, output.toString().replace("\r\n", "\n"));

    }
}

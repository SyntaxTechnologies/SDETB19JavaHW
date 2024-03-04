package e45Test;

import org.example.e45.E45SwitchStatment;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E45SwitchStatementTest {
    private InputStream originalSystemIn;
    private ByteArrayOutputStream outputStream;


    public void setUpInputOutput() {
        originalSystemIn = System.in;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemInAndOut() {
        System.setIn(originalSystemIn);
        System.setOut(System.out);
    }

    @Test
    public void testSwitchCaseOutputMonday() {
        setUpInputOutput();
        setSystemIn("1\n"); // Simulate user input of '1'
        E45SwitchStatment.main(new String[0]);
        assertEquals("Input a number between 1-7\nMonday\n", getOutput().replace("\r\n", "\n"));
        restoreSystemInAndOut();
    }

    @Test
    public void testSwitchCaseOutputInvalid() {
        setUpInputOutput();
        setSystemIn("10\n"); // Simulate user input of '10'
        E45SwitchStatment.main(new String[0]);
        assertEquals("Input a number between 1-7\nInvalid\n", getOutput().replace("\r\n", "\n"));
        restoreSystemInAndOut();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

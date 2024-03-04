package e43Test;

import org.example.e43.E43SwitchStatment;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E43SwitchStatmentTest {
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
    public void testSwitchCaseOutputJanuary() {
        setUpInputOutput();
        setSystemIn("1\n"); // Simulate user input of '1'
        E43SwitchStatment.main(new String[0]);
        assertEquals("Input a number between 1-12\nJanuary", getOutput().trim());
        restoreSystemInAndOut();
    }

    @Test
    public void testSwitchCaseOutputInvalid() {
        setUpInputOutput();
        setSystemIn("13\n"); // Simulate user input of '13'
        E43SwitchStatment.main(new String[0]);
        assertEquals("Input a number between 1-12\nInvalid", getOutput().trim());
        restoreSystemInAndOut();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString().replace("\r\n", "\n");
    }
}

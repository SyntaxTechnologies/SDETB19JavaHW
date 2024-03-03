package e44Test;

import org.example.e44.E44SwitchStatment;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E44SwitchStatmentTest {
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
    public void testSwitchCaseOutputBMW() {
        setUpInputOutput();
        setSystemIn("BMW\n"); // Simulate user input of 'BMW'
        E44SwitchStatment.main(new String[0]);
        assertEquals("Please enter your favorite car make\nYour favorite car is german car", getOutput().trim());
        restoreSystemInAndOut();

    }

    @Test
    public void testSwitchCaseOutputUnknown() {
        setUpInputOutput();
        setSystemIn("Mercedes\n"); // Simulate user input of 'Mercedes'
        E44SwitchStatment.main(new String[0]);
        assertEquals("Please enter your favorite car make\nYour favorite car is unknown", getOutput().trim());
        restoreSystemInAndOut();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString().replace("\r\n", "\n");
    }
}

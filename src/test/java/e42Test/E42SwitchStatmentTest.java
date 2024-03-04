package e42Test;

import org.example.e42.E42SwitchStatment;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E42SwitchStatmentTest {
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
    public void testSwitchCaseOutputRamesh() {
        setUpInputOutput();
        setSystemIn("101\n"); // Simulate user input of '101'
        E42SwitchStatment.main(new String[0]);
        assertEquals("Enter the roll number of the Child\nStudent name: Ramesh", getOutput().trim());
        restoreSystemInAndOut();
    }

    @Test
    public void testSwitchCaseOutputNotFound() {
        setUpInputOutput();
        setSystemIn("105\n"); // Simulate user input of '105'
        E42SwitchStatment.main(new String[0]);
        assertEquals("Enter the roll number of the Child\nNot found Student name: in Class", getOutput().trim());
        restoreSystemInAndOut();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString().replace("\r\n", "\n");
    }
}

package e40Test;

import org.example.e40.E40SwitchClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E40SwitchClassTest {
    private InputStream originalSystemIn;
    private ByteArrayOutputStream outputStream;


    public void setUpInputOutput() {
        originalSystemIn = System.in;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemIn() {
        System.setIn(originalSystemIn);
        System.setOut(System.out);
    }

    @Test
    public void testAsgharAssignment() {
        setUpInputOutput();
        setSystemIn("Asghar\n");
        E40SwitchClass.main(new String[0]);
        assertEquals("Will take care of Java Assignment", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testMoazzamAssignment() {
        setUpInputOutput();
        setSystemIn("Moazzam\n");
        E40SwitchClass.main(new String[0]);
        assertEquals("Will take care of SDLC Assignment", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testWeqasAssignment() {
        setUpInputOutput();
        setSystemIn("Weqas\n");
        E40SwitchClass.main(new String[0]);
        assertEquals("Will take care of Selenium Assignment", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testAselAssignment() {
        setUpInputOutput();
        setSystemIn("Asel\n");
        E40SwitchClass.main(new String[0]);
        assertEquals("Will take care of every Assignment", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testInvalidInstructor() {
        setUpInputOutput();
        setSystemIn("John\n");
        E40SwitchClass.main(new String[0]);
        assertEquals("Invalid instructor selected", getOutput().trim());
        restoreSystemIn();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

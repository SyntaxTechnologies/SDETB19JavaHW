package e49Test;

import org.example.e49.E49WhileLoop;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E49WhileLoopTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalSystemOut;


    public void setUpOutput() {
        outputStream = new ByteArrayOutputStream();
        originalSystemOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemOut() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void testWhileLoopOutput() {
        setUpOutput();
        E49WhileLoop.main(new String[0]);
        String expectedOutput = "Hello Syntax Team! How are you?\nHello Syntax Team! How are you?\nHello Syntax Team! How are you?\n"; // Expected output of the while loop
        assertEquals(expectedOutput, getOutput().replace("\r\n", "\n"));
        restoreSystemOut();
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

package e48Test;

import org.example.e48.E48WhileLoop;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E48WhileLoopTest {
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
        E48WhileLoop.main(new String[0]);
        String expectedOutput = "2\n4\n6\n8\n10\n12\n"; // Expected output of the while loop
        assertEquals(expectedOutput, getOutput().replace("\r\n", "\n"));
        restoreSystemOut();
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

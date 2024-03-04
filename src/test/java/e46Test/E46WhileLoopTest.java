package e46Test;

import org.example.e46.E46WhileLoop;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E46WhileLoopTest {
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
        E46WhileLoop.main(new String[0]);
        String expectedOutput = "0\n1\n2\n3\n4\n5\n6\n7\n8\n"; // Expected output of the while loop
        assertEquals(expectedOutput, getOutput().replace("\r\n", "\n"));
        restoreSystemOut();
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

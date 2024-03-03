package e47Test;

import org.example.e47.E47WhileLoop;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E47WhileLoopTest {
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
        E47WhileLoop.main(new String[0]);
        String expectedOutput = "15\n14\n13\n12\n11\n10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n0\n"; // Expected output of the while loop
        assertEquals(expectedOutput, getOutput().replace("\r\n", "\n"));
        restoreSystemOut();
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

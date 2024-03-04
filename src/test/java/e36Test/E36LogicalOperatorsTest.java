package e36Test;

import org.example.e36.E36LogicalOperators;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E36LogicalOperatorsTest {
    private InputStream originalSystemIn;
    private ByteArrayInputStream inputStream;
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream outputStream;



    public void setUpInput() {
        originalSystemIn = System.in;
        originalSystemOut = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemIn() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testAndCondition() {
        setUpInput();
        setSystemIn("hello\nhello\n5\n5\n");
        E36LogicalOperators.main(new String[0]);
        assertEquals("AND", outputStream.toString().trim());
        restoreSystemIn();
    }

    @Test
    public void testOrCondition() {
        setUpInput();
        setSystemIn("hello\nworld\n5\n5\n");
        E36LogicalOperators.main(new String[0]);
        assertEquals("OR", outputStream.toString().trim());
        restoreSystemIn();
    }

    @Test
    public void testNoneCondition() {
        setUpInput();
        setSystemIn("hello\nworld\n5\n10\n");
        E36LogicalOperators.main(new String[0]);
        assertEquals("NONE", outputStream.toString().trim());
        restoreSystemIn();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    /*private String getOutput() {

        return outputStream.toString();
    }*/
}

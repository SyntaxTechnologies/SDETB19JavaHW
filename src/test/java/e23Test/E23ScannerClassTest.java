
package e23Test;

import org.example.e23.E23ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

public class E23ScannerClassTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    // Corrected: Use InputStream here instead of casting to ByteArrayInputStream
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testBooleanValueTrue() {
        provideInput("true\n");
        E23ScannerClass.main(new String[]{});
        String expectedOutput = "Input the boolean value" + System.lineSeparator() + "The value is true" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testBooleanValueFalse() {
        provideInput("false\n");
        E23ScannerClass.main(new String[]{});
        String expectedOutput = "Input the boolean value" + System.lineSeparator() + "The value is false" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test(expected = InputMismatchException.class)
    public void testInvalidBooleanValue() {
        provideInput("not a boolean\n");
        E23ScannerClass.main(new String[]{});

    }

}


package e25Test;


import org.example.e25.E25ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E25ScannerClassTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
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
    public void testPositiveNumber() {
        provideInput("5\n");
        E25ScannerClass.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() + "5 is positive" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testNegativeNumber() {
        provideInput("-2\n");
        E25ScannerClass.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() + "-2 is negative" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testZeroNumber() {
        provideInput("0\n");
        E25ScannerClass.main(new String[]{});
        String expectedOutput = "In:" + System.lineSeparator() + "Entered number is equals to 0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

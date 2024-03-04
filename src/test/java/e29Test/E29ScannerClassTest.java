package e29Test;

import org.example.e29.E29ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E29ScannerClassTest {

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
    public void testProductPositive() {
        provideInput("2\n3\n");
        E29ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter first number" + System.lineSeparator() +
                "Please enter second number" + System.lineSeparator() +
                "true" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testProductNegative() {
        provideInput("-2\n3\n");
        E29ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter first number" + System.lineSeparator() +
                "Please enter second number" + System.lineSeparator() +
                "false" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testProductZero() {
        provideInput("0\n3\n");
        E29ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter first number" + System.lineSeparator() +
                "Please enter second number" + System.lineSeparator() +
                "false" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}


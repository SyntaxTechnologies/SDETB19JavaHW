package e28Test;


import org.example.e28.E28ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E28ScannerClassTest {

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
    public void testShapeIsRectangle() {
        provideInput("18\n16\n");
        E28ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter the length" + System.lineSeparator() +
                "Please enter the width" + System.lineSeparator() +
                "The shape of your object is rectangle" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testShapeIsSquare() {
        provideInput("16\n16\n");
        E28ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter the length" + System.lineSeparator() +
                "Please enter the width" + System.lineSeparator() +
                "The shape of your object is square" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}


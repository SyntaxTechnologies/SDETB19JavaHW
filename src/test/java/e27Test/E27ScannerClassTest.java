package e27Test;


import org.example.e27.E27ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E27ScannerClassTest {

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
    public void testEligibleToVote() {
        provideInput("18\n");
        E27ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter your age" + System.lineSeparator() + "You are eligible to vote" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testNotEligibleToVote() {
        provideInput("16\n");
        E27ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter your age" + System.lineSeparator() + "You are not eligible to vote" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    // Additional tests could include boundary cases like testing age 17 and 18
    @Test
    public void testBoundaryCase17() {
        provideInput("17\n");
        E27ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter your age" + System.lineSeparator() + "You are not eligible to vote" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testBoundaryCase18() {
        provideInput("18\n");
        E27ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter your age" + System.lineSeparator() + "You are eligible to vote" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}


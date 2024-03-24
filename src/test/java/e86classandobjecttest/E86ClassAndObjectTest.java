package e86classandobjecttest;


import org.example.e86.E86ClassAndObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E86ClassAndObjectTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testOutput() {
     E86ClassAndObject.main(new String[]{});
        String expectedOutput = "Name is John and roll number is 2";
        assertEquals(expectedOutput, outContent.toString());
    }
}

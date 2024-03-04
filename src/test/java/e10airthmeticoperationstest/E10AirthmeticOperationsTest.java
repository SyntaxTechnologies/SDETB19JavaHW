package e10airthmeticoperationstest;
import org.example.e10.E10AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E10AirthmeticOperationsTest {
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
    public void testProblem010Output() {
        E10AirthmeticOperations.main(new String[]{});
        String expectedOutput = "300" + System.lineSeparator() +
                "100" + System.lineSeparator() +
                "20000" + System.lineSeparator() +
                "2"+ System.lineSeparator() ;
        assertEquals(expectedOutput, outContent.toString());
    }
}
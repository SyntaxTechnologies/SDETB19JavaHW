package e108javamethodstest;

import org.example.e108.E108JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class e108javamethodstest {

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
    public void testMethodPrints() {
        String[] args = {}; // No arguments needed for this test
        E108JavaMethods.main(args);
        String expectedOutput = "m1 method implementation" + System.lineSeparator() +
                "m2 method implementation" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}




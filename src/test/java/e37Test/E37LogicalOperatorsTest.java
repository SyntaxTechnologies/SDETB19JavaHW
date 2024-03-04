package e37Test;

import org.example.e37.E37LogicalOperators;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E37LogicalOperatorsTest {
    private InputStream originalSystemIn;
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream outputStream;

   // @BeforeEach
    public void setUpInput() {


        originalSystemIn = System.in;
        originalSystemOut = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

   // @AfterEach
    public void restoreSystemIn() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut); // Reset System.out to the original PrintStream
    }

    @Test
    public void testThirstyNotSleepy() {
        setUpInput();
        setSystemIn("true\nfalse\n");
        E37LogicalOperators.main(new String[0]);
        assertEquals("Looks like you need to drink water", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testThirsty() {
        setUpInput();
        setSystemIn("true\ntrue\n");
        E37LogicalOperators.main(new String[0]);
        assertEquals("Looks like you need to drink coffee", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testSleepy() {
        setUpInput();
        setSystemIn("false\ntrue\n");
        E37LogicalOperators.main(new String[0]);
        assertEquals("Looks like you need to drink tea", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testNotThirstyNotSleepy() {
        setUpInput();
        setSystemIn("false\nfalse\n");
        E37LogicalOperators.main(new String[0]);
        assertEquals("Looks like you need to drink nothing", getOutput().trim());
        restoreSystemIn();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {

        return outputStream.toString();
    }
}

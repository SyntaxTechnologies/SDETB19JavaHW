package e35Test;

import org.example.e35.E35LogicalOperators;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E35LogicalOperatorsTest {
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
    public void testNotEligible() {
        setUpInput();
        setSystemIn("true\n500\n");
        E35LogicalOperators.main(new String[0]);
        assertEquals("The eligibility is Not eligible", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testMaybeEligible() {
        setUpInput();
        setSystemIn("true\n650\n");
        E35LogicalOperators.main(new String[0]);
        assertEquals("The eligibility is Maybe eligible", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testEligible() {
        setUpInput();
        setSystemIn("true\n750\n");
        E35LogicalOperators.main(new String[0]);
        assertEquals("The eligibility is Eligible", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testDefinitelyEligible() {
        setUpInput();
        setSystemIn("true\n850\n");
        E35LogicalOperators.main(new String[0]);
        assertEquals("The eligibility is Definitely eligible", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testUnknown() {
        setUpInput();
        setSystemIn("false\n");
        E35LogicalOperators.main(new String[0]);
        assertEquals("The eligibility is Unknown", getOutput().trim());
        restoreSystemIn();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {

        return outputStream.toString();
    }
}

package e39Test;

import org.example.e39.E39LogicalOperators;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E39LogicalOperatorsTest {
    private InputStream originalSystemIn;
    private ByteArrayOutputStream outputStream;


    public void setUpInputOutput() {
        originalSystemIn = System.in;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemIn() {
        System.setIn(originalSystemIn);
        System.setOut(System.out);
    }

    @Test
    public void testGradeF() {
        setUpInputOutput();
        setSystemIn("15\n"); // Simulate a mark for grade F
        E39LogicalOperators.main(new String[0]);
        assertEquals("Your grade is F", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testGradeE() {
        setUpInputOutput();
        setSystemIn("35\n"); // Simulate a mark for grade E
        E39LogicalOperators.main(new String[0]);
        assertEquals("Your grade is E", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testGradeD() {
        setUpInputOutput();
        setSystemIn("48\n"); // Simulate a mark for grade D
        E39LogicalOperators.main(new String[0]);
        assertEquals("Your grade is D", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testGradeC() {
        setUpInputOutput();
        setSystemIn("55\n"); // Simulate a mark for grade C
        E39LogicalOperators.main(new String[0]);
        assertEquals("Your grade is C", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testGradeB() {
        setUpInputOutput();
        setSystemIn("75\n"); // Simulate a mark for grade B
        E39LogicalOperators.main(new String[0]);
        assertEquals("Your grade is B", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testGradeA() {
        setUpInputOutput();
        setSystemIn("90\n"); // Simulate a mark for grade A
        E39LogicalOperators.main(new String[0]);
        assertEquals("Your grade is A", getOutput().trim());
        restoreSystemIn();
    }

    @Test
    public void testInvalidMark() {
        setUpInputOutput();
        setSystemIn("-5\n"); // Simulate an invalid mark
        E39LogicalOperators.main(new String[0]);
        assertEquals("Please enter valid mark", getOutput().trim());
        restoreSystemIn();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

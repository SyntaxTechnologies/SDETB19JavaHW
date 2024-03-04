package e38Test;

import org.example.e38.E38LogicalOperators;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E38LogicalOperatorsTest {
    private InputStream originalSystemIn;
    private ByteArrayOutputStream outputStream;


    public void setUpInputOutput() {
        originalSystemIn = System.in;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemInAndOut() {
        System.setIn(originalSystemIn);
        System.setOut(System.out);
    }

    @Test
    public void testWeekdayLearning() {
        setUpInputOutput();
        setSystemIn("false\n"); // Simulate it's not a weekend
        E38LogicalOperators.main(new String[0]);
        assertEquals("Today you will be learning manual testing", getOutput().trim());
        restoreSystemInAndOut();
    }

    @Test
    public void testWeekendLearning() {
        setUpInputOutput();
        setSystemIn("true\n"); // Simulate it's a weekend
        E38LogicalOperators.main(new String[0]);
        assertEquals("Today you will be learning Java", getOutput().trim());
        restoreSystemInAndOut();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString();
    }
}

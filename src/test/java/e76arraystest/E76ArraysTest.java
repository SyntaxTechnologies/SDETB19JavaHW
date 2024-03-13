package e76arraystest;
import static org.junit.Assert.*;

import org.example.e76.E76Arrays;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class E76ArraysTest {

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
    public void testWeekDaysInput() {
        String inputData = "Sunday\nMonday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\n";
        provideInput(inputData);
        E76Arrays.main(new String[]{});
        String lineSeparator = System.getProperty("line.separator");
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 1; i <= 7; i++) {
            expectedOutput.append("Please enter day ").append(i).append(" of the week").append(lineSeparator);
        }
        expectedOutput.append("Sunday").append(lineSeparator)
                .append("Monday").append(lineSeparator)
                .append("Tuesday").append(lineSeparator)
                .append("Wednesday").append(lineSeparator)
                .append("Thursday").append(lineSeparator)
                .append("Friday").append(lineSeparator)
                .append("Saturday").append(lineSeparator);
        assertEquals(expectedOutput.toString(), outContent.toString());
    }

    // Additional tests can be written here to cover more scenarios, such as invalid inputs, but
    // since the provided code does not handle errors or exceptions for invalid inputs, those tests are not included here.
}
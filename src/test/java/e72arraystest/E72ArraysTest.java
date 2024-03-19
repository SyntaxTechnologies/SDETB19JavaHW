package e72arraystest;

import org.example.e72.E72Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
// ... [rest of the imports]

public class E72ArraysTest {
    // ... [rest of the test fields]

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
        String inputData = String.join("\n",
                "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday");
        provideInput(inputData);
        E72Arrays.main(new String[]{});
        String expectedOutput = String.join(System.lineSeparator(),
                "Please enter day 1 of the week",
                "Please enter day 2 of the week",
                "Please enter day 3 of the week",
                "Please enter day 4 of the week",
                "Please enter day 5 of the week",
                "Please enter day 6 of the week",
                "Please enter day 7 of the week",
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday" + System.lineSeparator()); // Add an extra newline for the last print statement
        assertEquals(expectedOutput, outContent.toString());
    }
}

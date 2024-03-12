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
    public void testDaysOfTheWeekInput() {
        String input = String.join(System.lineSeparator(),
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        provideInput(input);

        E72Arrays.main(new String[]{});

        String[] lines = outContent.toString().trim().split(System.lineSeparator());
        String[] expectedPrompts = {
                "Please enter day 1 of the week",
                "Please enter day 2 of the week",
                "Please enter day 3 of the week",
                "Please enter day 4 of the week",
                "Please enter day 5 of the week",
                "Please enter day 6 of the week",
                "Please enter day 7 of the week"
        };

        // Starting index of prompts in the output lines, in case there is a header or other lines before.
        int startIndexOfPrompts = 0; // Adjust this if there are extra lines before the prompts start.

        // Validate prompts
        for (int i = 0; i < expectedPrompts.length; i++) {
            assertEquals("Prompt for day " + (i + 1) + " did not match expected output.",
                    expectedPrompts[i],
                    lines[startIndexOfPrompts + i * 2]);
        }

        // Validate days printed
        for (int i = 0; i < 7; i++) {
            assertEquals("Day " + (i + 1) + " output did not match expected.",
                    input.split(System.lineSeparator())[i],
                    lines[startIndexOfPrompts + i * 2 + 1]);
        }
    }
}

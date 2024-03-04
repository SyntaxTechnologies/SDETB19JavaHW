package e7stringconcatenationtest;
import org.example.e7.E7StringConcatenation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E7StringConcatenationTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testStringConcatenation() {
        E7StringConcatenation.main(new String[]{});
        // Declare a variable and assign the value of "Java" to it
        //String language = "Java";

        // Declare a variable and assign the value of "programming language" to it
        //String description = "programming language";

        // Concatenate both strings
        //String concatenatedString = language + " is the #1 " + description;

        // Define the expected output
        String expectedOutput = "Java is the #1 programming language"+ System.lineSeparator();

        String failureMessage ="Declare a variable and assign the value of \"Java\" to it.\n" +
                "Declare a variable and assign the value of \"programming language\" to it.\n" +
                "Concatenate both Strings and output should look like as below.\n" +
                "**Output:**\n" +
                "```\n" +
                "Java is the #1 programming language";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

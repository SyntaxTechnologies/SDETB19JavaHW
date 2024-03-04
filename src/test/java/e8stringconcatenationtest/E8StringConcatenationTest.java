package e8stringconcatenationtest;
import org.example.e8.E8StringConcatenation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E8StringConcatenationTest {
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
        E8StringConcatenation.main(new String[]{});
        // Create two strings and concatenate them
        //String str1 = "syntax";
        //String str2 = "techs.com";
        //String concatenatedString = str1 + str2;

        // Define the expected output
        String expectedOutput = "syntaxtechs.com" +System.lineSeparator();
        String failureMessage ="Create 2 Strings\n" +
                "Use the concatenation operation to make the following output\n" +
                "**Output:**\n" +
                "syntaxtechs.com";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

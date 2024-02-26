package e21Test;

import org.example.e21.E21ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E21ScannerClassTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("25\n".getBytes());
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    @Test
    public void testAgeAfterTenYears() {
        String[] args = {}; // No arguments needed for this test
        E21ScannerClass.main(args);
        String expectedOutput = "Enter your age \nYour age after 10 years is 35\n";
        String failureMessage ="Write a program that asks the user's age: \"Enter your age \"\n" +
                "Then display it by adding 10 (i.e age + 10) in your final output.";

        // Compare the concatenated string with the expected output
        //assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
        assertEquals(failureMessage,expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}

package e20Test;

import org.example.e20.E20ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E20ScannerClassTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("John Doe\n".getBytes());
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
    public void testMainMethod() {

            String[] args = {}; // No arguments needed for this test
        E20ScannerClass.main(new String[]{});
            String expectedOutput = "Please Enter First Name\nPlease Enter Last Name\nJohn Doe\n";
            assertEquals(expectedOutput, outContent.toString());
        }



        // Define the expected output
        //String expectedOutput = "Please Enter First Name\nPlease Enter Last Name\nCindy Crawford";
        String failureMessage ="Write a program that takes user's first name and last name and prints in console\n" +
                "Instruct the user to enter first name: \"Please Enter First Name\"\n" +
                "Capture the first name\n" +
                "Instruct the user to enter last name:\"Please Enter Last Name\"\n" +
                "Capture last name\n" +
                "Print first name and last name\n" +
                "Final Output:\n" +
                "Example:\n" +
                "Please Enter First Name\n" +
                "Please Enter Last Name\n" +
                "Cindy Crawford";

        // Compare the concatenated string with the expected output
        //assertEquals(failureMessage,expectedOutput, output.toString());

    }


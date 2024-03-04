package e13Test;

import org.example.e13.E13AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E13AirthmeticOperationsTest {
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
    public void testMagicNumberCalculation() {
        E13AirthmeticOperations.main(new String[]{});

        // Define the expected output
        String expectedOutput = "The magic number is 3!"+ System.lineSeparator();;
        String failureMessage ="Math Magic\n" +
                "In this project, you will become a magician and write a small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you created.\n" +
                "For you to do:\n" +
                "Create an int variable called myNumber. Set it equal to any number other than 0.\n" +
                "We will refer to myNumber as the original number from now on.\n" +
                "Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.\n" +
                "Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).\n" +
                "Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.\n" +
                "Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.\n" +
                "Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.\n" +
                "Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.\n" +
                "Let's print out the value of the last step as: \"The magic number is _ !\"\n" +
                "Now try running your code! What number is printed to the console?\n" +
                "Now, go back to your code and change myNumber to any other integer.\n" +
                "Run your program again.\n" +
                "Is the output the same?\n" +
                "It's math magic!\n" +
                "Output:\n" +
                "The magic number is _!";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}

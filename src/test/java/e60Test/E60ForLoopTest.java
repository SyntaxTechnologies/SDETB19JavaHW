package e60Test;

import org.example.e60.E60ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E60ForLoopTest {
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
    public void testCountdown() {
        E60ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "10\n9\n8\n7\n6\n5\n4\n3\n2\n1\nHappy New Year!";

        String failureMessage ="Write a program that prints the count down from 10 up to 1 and then says \"Happy New Year!\".\n" +
                "Output:\n" +
                "10\n" +
                "9\n" +
                "8\n" +
                "7\n" +
                "6\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "Happy New Year!\n";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

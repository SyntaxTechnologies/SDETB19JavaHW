package e59Test;

import org.example.e59.E59ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E59ForLoopTest {
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
    public void testYearPrinting() {
        E59ForLoop.main(new String[]{});
        // Define the expected output
        String expectedOutput = "Hey, it is year:\n2011\nHey, it is year:\n2012\nHey, it is year:\n2013\nHey, it is year:\n2014\nHey, it is year:\n2015\nHey, it is year:\n2016\nHey, it is year:\n2017\nHey, it is year:\n2018\nHey, it is year:\n2019\n";

        String failureMessage ="Write a program that prints the string \"Hey, it is year: \" and the years between 2011 and 2019.\n" +
                "Must include year 2019 in the output\n" +
                "Output:\n" +
                "Hey, it is year:\n" +
                "2011\n" +
                "Hey, it is year:\n" +
                "2012\n" +
                "Hey, it is year:\n" +
                "2013\n" +
                "Hey, it is year:\n" +
                "2014\n" +
                "Hey, it is year:\n" +
                "2015\n" +
                "Hey, it is year:\n" +
                "2016\n" +
                "Hey, it is year:\n" +
                "2017\n" +
                "Hey, it is year:\n" +
                "2018\n" +
                "Hey, it is year:\n" +
                "2019";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}

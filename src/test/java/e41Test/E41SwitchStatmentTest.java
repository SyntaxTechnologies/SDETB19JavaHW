package e41Test;

import org.example.e41.E41SwitchStatment;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E41SwitchStatmentTest {
    private InputStream originalSystemIn;
    private ByteArrayOutputStream outputStream;


    public void setUpInputOutput() {
        originalSystemIn = System.in;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemInAndOut() {
        System.setIn(originalSystemIn);
        System.setOut(System.out);
    }

    @Test
    public void testSwitchCaseOutputYouCanCrawl() {
        setUpInputOutput();
        setSystemIn("1\n"); // Simulate user input of '1'
        E41SwitchStatment.main(new String[0]);
        assertEquals("Enter the age of the Child\nYou can Crawl", getOutput().trim());
        restoreSystemInAndOut();
    }

    @Test
    public void testSwitchCaseOutputYouCanDance() {
        setUpInputOutput();
        setSystemIn("3\n"); // Simulate user input of '3'
        E41SwitchStatment.main(new String[0]);
        assertEquals("Enter the age of the Child\nYou can Dance", getOutput().trim());
        restoreSystemInAndOut();
    }

    @Test
    public void testSwitchCaseOutputIDontKnowHowOldYouAre() {
        setUpInputOutput();
        setSystemIn("10\n"); // Simulate user input of '10'
        E41SwitchStatment.main(new String[0]);
        assertEquals("Enter the age of the Child\nI don't know how old you are", getOutput().trim());
        restoreSystemInAndOut();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString().replace("\r\n", "\n");
    }
}

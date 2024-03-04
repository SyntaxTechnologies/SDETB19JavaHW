
package e24Test;

import org.example.e24.E24ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E24ScannerClassTest {

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
    public void testValidUserName() {
        String userName = "Sumair";
        provideInput(userName + "\n");
        E24ScannerClass.main(new String[]{});
        String expectedOutput = "Hello, please enter your name" + System.lineSeparator() + "Your name is " + userName + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    // Additional test cases could include testing for edge cases like empty strings or very long names
}


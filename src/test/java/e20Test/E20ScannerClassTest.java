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
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(originalIn);
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
    public void testFullName() {
        provideInput("John\nDoe\n");
        E20ScannerClass.main(new String[]{});
        String expectedOutput = "Please Enter First Name" + System.lineSeparator() +
                "Please Enter Last Name" + System.lineSeparator() +
                "John Doe" ;
        assertEquals(expectedOutput, outContent.toString());
    }
}
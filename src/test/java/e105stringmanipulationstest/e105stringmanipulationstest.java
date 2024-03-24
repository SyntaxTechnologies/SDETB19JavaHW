package e105stringmanipulationstest;

import org.example.e104.E104StringManipulations;
import org.example.e105.E105StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class e105stringmanipulationstest {

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
    public void testVowelsInHowdyho() {
        provideInput("howdyho\n");
        E105StringManipulations.main(new String[]{});
        String expectedOutput = "In:oo" ;
        assertEquals(expectedOutput, outContent.toString().replace(System.lineSeparator(), "\n"));
    }

    @Test
    public void testVowelsInHuehuehuehue() {
        provideInput("huehuehuehue\n");
        E105StringManipulations.main(new String[]{});
        String expectedOutput = "In:ueueueue" ;
        assertEquals(expectedOutput, outContent.toString().replace(System.lineSeparator(), "\n"));
    }

    @Test
    public void testVowelsInPoopooWhatIdkWhatImDoing() {
        provideInput("poopoo what idk what im doing\n");
        E105StringManipulations.main(new String[]{});
        String expectedOutput = "In:ooooaiaioi" ;
        assertEquals(expectedOutput, outContent.toString().replace(System.lineSeparator(), "\n"));
    }
}
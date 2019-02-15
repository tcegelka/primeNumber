import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void mainCalledWithNull() {
        Main.main(null);

        assertEquals(outputStream.toString().trim(), "Please provide two integers");
    }

    @Test
    void mainCalledWithNoInputs() {
        String[] args = new String[0];
        Main.main(args);

        assertEquals(outputStream.toString().trim(), "Please provide two integers");
    }

    @Test
    void mainCalledWithOneInput() {
        String[] args = new String[1];
        args[0] = "7";
        Main.main(args);

        assertEquals(outputStream.toString().trim(), "Please provide two integers");
    }

    @Test
    void mainCalledWithFloats() {
        String[] args = new String[2];
        args[0] = "7.9";
        args[1] = "77.7";
        Main.main(args);

        assertEquals(outputStream.toString().trim(), "Please provide two integers");
    }

    @Test
    void mainCalledWithZeroThroughTwentyFive() {
        String[] args = new String[2];
        args[0] = "0";
        args[1] = "25";
        Main.main(args);

        assertEquals(outputStream.toString().trim(), "[2, 3, 5, 7, 11, 13, 17, 19, 23]");
    }
}

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            assertDoesNotThrow(() -> App.main(new String[] {}));
            String output = outContent.toString();
            assertTrue(output.contains("Alice")); // or any expected XML content
        } finally {
            System.setOut(originalOut);
        }
    }
}
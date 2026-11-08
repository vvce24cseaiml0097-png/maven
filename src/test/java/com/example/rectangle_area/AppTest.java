
package com.example.rectangle_area;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testRectangleArea() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));

            App.main(new String[]{});

        } finally {
            System.setOut(original);
        }

        String result = output.toString();

        assertTrue(result.contains("Length = 10.0"));
        assertTrue(result.contains("Breadth = 5.0"));
        assertTrue(result.contains("Area of Rectangle = 50.0"));
    }
}

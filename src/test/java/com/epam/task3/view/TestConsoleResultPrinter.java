package com.epam.task3.view;

import com.epam.task3.exceptions.DataException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestConsoleResultPrinter {
    private static final ResultPrinter PRINTER = new ConsoleResultPrinter();
    private static final ByteArrayOutputStream OUT = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(OUT));
    }

    @Test
    public void testPrintShouldPrintWhenDataIsCorrect() throws DataException, IOException {
        PRINTER.printResult(7);
        String expected="Cost of this bouquet =7\r\n";
        Assert.assertEquals(expected,OUT.toString());
    }
    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }
}

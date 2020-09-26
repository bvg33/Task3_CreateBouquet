package com.epam.task3.view;

import com.epam.task3.exceptions.DataException;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFileResultPrinter {
    private static final String FILENAME="src/test/resources/output.txt";
    private static final ResultPrinter PRINTER=new FileResultPrinter(FILENAME);
    @Test
    public void testPrintShouldWorkWhenDataIsCorrect() throws DataException, IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(FILENAME));
        PRINTER.printResult(7);
        String actual=bufferedReader.readLine();
        String expected="Cost of this bouquet =7";
        Assert.assertEquals(expected,actual);
        bufferedReader.close();
    }
}

package com.epam.task3.data;

import com.epam.task3.exceptions.DataException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestConsoleDataAcquirer {
    private static final DataAcquirer ACQUIRER = new ConsoleDataAcquirer();

    @Test
    public void testGetNumberShouldWorkWhenDataIsCorrect() throws DataException {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(5.0, ACQUIRER.getNumber(), 0.00001);

    }
}

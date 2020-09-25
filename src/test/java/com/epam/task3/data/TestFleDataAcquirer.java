package com.epam.task3.data;

import com.epam.task3.exceptions.DataException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestFleDataAcquirer {
    private static final String FILENAME="src/test/resources/input.txt";
    private static final DataAcquirer ACQUIRER = new FileDataAcquirer(FILENAME);

    @Test
    public void testGetNumberShouldWorkWhenDataIsCorrect() throws DataException {
        Assert.assertEquals(5.0, ACQUIRER.getNumber(), 0.00001);

    }
}

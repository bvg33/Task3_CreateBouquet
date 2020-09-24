package com.epam.task3.data;

import com.epam.task3.exceptions.DataException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private String filename;

    public FileDataAcquirer(String filename) {
        this.filename = filename;
    }

    @Override
    public int getNumber() throws DataException {
        String line = null;
        int number;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            line = reader.readLine();
            number = Integer.parseInt(line);
        } catch (IOException | NumberFormatException e) {
            throw new DataException("Incorrect data", e);
        }
        return number;
    }
}

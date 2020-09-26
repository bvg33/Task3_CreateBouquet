package com.epam.task3.view;

import com.epam.task3.exceptions.DataException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileResultPrinter implements ResultPrinter {
    private String filename;

    public FileResultPrinter(String filename) {
        this.filename = filename;
    }

    @Override
    public void printResult(int costOfBouquet) throws DataException {
        String line="";
        line="Cost of this bouquet ="+costOfBouquet+'\n';
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(line);
        } catch (IOException e) {
            throw new DataException("Output exception", e);
        }
    }
}

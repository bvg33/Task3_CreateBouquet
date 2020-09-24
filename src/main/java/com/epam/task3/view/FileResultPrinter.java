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
    public void printResult(int costOfBouquet, int numberOfChamomiles, int numberOfRoses) throws DataException {
        String line="";
        line="Cost of bouquet ="+costOfBouquet+'\n'+
        "Number of roses ="+numberOfRoses+'\n'+
        "Number of chamomiles = "+numberOfChamomiles+'\n';
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(line);
        } catch (IOException e) {
            throw new DataException("Output exception", e);
        }
    }
}

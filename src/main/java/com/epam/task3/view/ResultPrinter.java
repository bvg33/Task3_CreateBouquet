package com.epam.task3.view;

import com.epam.task3.exceptions.DataException;

public interface ResultPrinter {
    void printResult(int costOfBouquet, int numberOfChamomiles, int numberOfRoses) throws DataException;
}

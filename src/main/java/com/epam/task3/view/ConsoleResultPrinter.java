package com.epam.task3.view;

public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void printResult(int costOfBouquet) {
        System.out.println("Cost of this bouquet ="+costOfBouquet);
    }
}

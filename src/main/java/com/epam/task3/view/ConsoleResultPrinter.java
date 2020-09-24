package com.epam.task3.view;

public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void printResult(int costOfBouquet, int numberOfChamomiles, int numberOfRoses) {
        System.out.println("Cost of bouquet ="+costOfBouquet);
        System.out.println("Number of roses ="+numberOfRoses);
        System.out.println("Number of chamomiles = "+numberOfChamomiles);
    }
}

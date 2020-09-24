package com.epam.task3;

import com.epam.task3.calculator.CalculateCostOfBouquet;
import com.epam.task3.data.DataAcquirer;
import com.epam.task3.data.DataAcquirerFactory;
import com.epam.task3.enums.TypesOfDataAcquirers;
import com.epam.task3.enums.TypesOfResultPrinters;
import com.epam.task3.exceptions.DataException;
import com.epam.task3.exceptions.NoSuchRealizationOfInterfaceException;
import com.epam.task3.flowers.BasketForFlowers;
import com.epam.task3.flowers.Flower;
import com.epam.task3.view.ConsoleResultPrinter;
import com.epam.task3.view.ResultPrinter;
import com.epam.task3.view.ResultPrinterFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws DataException, NoSuchRealizationOfInterfaceException {
        //ввод
        DataAcquirer acquirer = DataAcquirerFactory.createDataAcquirer(TypesOfDataAcquirers.FILE);
        int numberOfFlowersInBouquet = acquirer.getNumber();
        //создание букета
        BasketForFlowers basket = new BasketForFlowers();
        basket.createBouquet(numberOfFlowersInBouquet);
        //подсчет стоимости букета
        CalculateCostOfBouquet calculator = new CalculateCostOfBouquet();
        List<Flower> bouquet = basket.getBouquet();
        int resultCost = calculator.calculateCost(bouquet);
        //вывод
        ResultPrinter printer = ResultPrinterFactory.createResultPrinter(TypesOfResultPrinters.FILE);
        int numberOfCham = basket.getNumberOfCham();
        int numberOfRoses = basket.getNumberOfRoses();
        printer.printResult(resultCost, numberOfCham, numberOfRoses);
    }
}

package com.epam.task3;

import com.epam.task3.calculator.CalculateCostOfBouquet;
import com.epam.task3.enums.TypesOfFlowers;
import com.epam.task3.enums.TypesOfResultPrinters;
import com.epam.task3.exceptions.DataException;
import com.epam.task3.exceptions.NoSuchRealizationOfInterfaceException;
import com.epam.task3.model.BasketForFlowers;
import com.epam.task3.model.Flower;
import com.epam.task3.view.ResultPrinter;
import com.epam.task3.view.ResultPrinterFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws DataException, NoSuchRealizationOfInterfaceException {
        //создание букета
        Flower rose = new Flower(5, TypesOfFlowers.ROSE);
        Flower chamomile = new Flower(3, TypesOfFlowers.CHAMOMILE);
        Flower lily = new Flower(4, TypesOfFlowers.LILY);
        BasketForFlowers basket = new BasketForFlowers();
        basket.addToBouquet(rose, chamomile, lily);
        //подсчет стоимости букета
        CalculateCostOfBouquet calculator = new CalculateCostOfBouquet();
        List<Flower> bouquet = basket.getBouquet();
        int resultCost = calculator.calculateCost(bouquet);
        //вывод
        ResultPrinter printer = ResultPrinterFactory.createResultPrinter(TypesOfResultPrinters.FILE);
        printer.printResult(resultCost);
    }
}

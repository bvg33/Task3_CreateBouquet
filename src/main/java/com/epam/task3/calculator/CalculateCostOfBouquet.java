package com.epam.task3.calculator;

import com.epam.task3.flowers.Flower;

import java.util.List;

public class CalculateCostOfBouquet {
    public int calculateCost(List<Flower> bouquet) {
        int sum = 0;
        for (Flower flower : bouquet) {
            sum += flower.getCost();
        }
        return sum;
    }
}

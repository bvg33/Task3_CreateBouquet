package com.epam.task3.calculator;

import com.epam.task3.enums.TypesOfFlowers;
import com.epam.task3.model.Flower;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TestCalculateCostOfBouquet {
    private static final CalculateCostOfBouquet CALCULATOR = new CalculateCostOfBouquet();


    @Test
    public void calculateCostShouldCalculateWhenDataIsCorrect() {
        List<Flower> flowerList = new ArrayList<>();
        flowerList.add(new Flower(5, TypesOfFlowers.ROSE));
        flowerList.add(new Flower(3, TypesOfFlowers.CHAMOMILE));
        int actual = CALCULATOR.calculateCost(flowerList);
        Assert.assertEquals(8, actual);
    }

    @Test
    public void calculateCostShouldReturnZeroWhenListIsEmpty() {
        List<Flower> flowerList = new ArrayList<>();
        int actual = CALCULATOR.calculateCost(flowerList);
        Assert.assertEquals(0, actual);
    }
}

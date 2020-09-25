package com.epam.task3.calculator;

import com.epam.task3.flowers.Chamomile;
import com.epam.task3.flowers.Flower;
import com.epam.task3.flowers.Rose;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCalculateCostOfBouquet {
    private static final CalculateCostOfBouquet CALCULATOR = new CalculateCostOfBouquet();
    @Test
    public void calculateCostShouldCalculateWhenDataIsCorrect(){
        List<Flower>flowerList=new ArrayList<>();
        flowerList.add(new Rose());
        flowerList.add(new Chamomile());
        int actual=CALCULATOR.calculateCost(flowerList);
        Assert.assertEquals(8,actual);
    }
    @Test
    public void calculateCostShouldReturnZeroWhenListIsEmpty(){
        List<Flower>flowerList=new ArrayList<>();
        int actual=CALCULATOR.calculateCost(flowerList);
        Assert.assertEquals(0,actual);
    }
}

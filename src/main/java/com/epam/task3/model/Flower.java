package com.epam.task3.model;

import com.epam.task3.enums.TypesOfFlowers;

public class Flower {

    private int cost;
    private TypesOfFlowers typeOfFlower;

    public Flower(int cost, TypesOfFlowers typeOfFlower) {
        this.cost = cost;
        this.typeOfFlower = typeOfFlower;
    }

    public int getCost() {
        return cost;
    }

    public TypesOfFlowers getTypeOfFlower() {
        return typeOfFlower;
    }
}

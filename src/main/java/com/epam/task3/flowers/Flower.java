package com.epam.task3.flowers;

import java.util.List;

public abstract class Flower {

    private int cost;

    public Flower(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public abstract void addToBouquet(List<Flower> bouquet);
}

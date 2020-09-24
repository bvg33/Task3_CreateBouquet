package com.epam.task3.flowers;

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
}

package com.epam.task3.flowers;

public class Rose extends Flower {
    private int numberOfSpikes = 15;
    private static final int STANDARD_COST_OF_ROSE = 5;

    public Rose() {
        super(STANDARD_COST_OF_ROSE);
    }

    public Rose(int cost) {
        super(cost);
    }

    public void deleteSpikes() {
        numberOfSpikes = 0;
        System.out.println("rose spikes removed");
    }
}

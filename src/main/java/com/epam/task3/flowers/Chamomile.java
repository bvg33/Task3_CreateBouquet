package com.epam.task3.flowers;

import java.util.List;
import java.util.Random;

public class Chamomile extends Flower {
    private static final int STANDARD_COST_OF_CHAMOMILE = 3;

    public Chamomile(int cost) {
        super(cost);
    }

    @Override
    public void addToBouquet(List<Flower> bouquet) {
        bouquet.add(this);
    }

    public Chamomile() {
        super(STANDARD_COST_OF_CHAMOMILE);
    }

}

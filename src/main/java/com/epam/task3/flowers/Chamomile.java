package com.epam.task3.flowers;

import java.util.Random;

public class Chamomile extends Flower {
    private static final int STANDARD_COST_OF_CHAMOMILE = 3;
    private boolean resultOfDivination = false;

    public Chamomile(int cost) {
        super(cost);
    }

    public Chamomile() {
        super(STANDARD_COST_OF_CHAMOMILE);
    }

    public boolean divination() {
        Random random = new Random();
        int result = random.nextInt(100);
        if (result % 2 == 0) {
            resultOfDivination = true;
        } else {
            resultOfDivination = false;
        }
        return resultOfDivination;
    }
}

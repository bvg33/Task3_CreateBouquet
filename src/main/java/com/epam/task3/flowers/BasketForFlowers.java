package com.epam.task3.flowers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasketForFlowers {
    private List<Flower> bouquet = new ArrayList<>();
    private int numberOfRoses = 0;
    private int numberOfCham = 0;

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Flower> bouquet) {
        this.bouquet = bouquet;
    }

    public void createBouquet(int numberOfFlowers) {
        Random random = new Random();
        for (int i = 0; i < numberOfFlowers; i++) {
            if (random.nextInt(50) % 2 == 0) {
                new Rose().addToBouquet(bouquet);
                numberOfRoses++;
            } else {
                new Chamomile().addToBouquet(bouquet);
                numberOfCham++;
            }
        }
    }

    public int getNumberOfRoses() {
        return numberOfRoses;
    }

    public int getNumberOfCham() {
        return numberOfCham;
    }
}

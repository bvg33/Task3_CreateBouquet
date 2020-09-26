package com.epam.task3.model;

import java.util.ArrayList;
import java.util.List;

public class BasketForFlowers {
    private List<Flower> bouquet = new ArrayList<>();

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void removeFromBouquet(Flower flower){
        bouquet.remove(flower);
    }
    public void addToBouquet(Flower...flowers){
        for(Flower flower:flowers){
            bouquet.add(flower);
        }
    }

}

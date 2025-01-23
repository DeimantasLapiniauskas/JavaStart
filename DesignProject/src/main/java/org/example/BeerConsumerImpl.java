package org.example;

import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;

public class BeerConsumerImpl extends BeerConsumer {
    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {
        return false;
    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean b) {
        return null;
    }
}

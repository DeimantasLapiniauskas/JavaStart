package org.example;

import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

public class BeerFactoryImpl implements BeerFactory {
    @Override
    public void receiveMaltShippment(double v) {

    }

    @Override
    public DefaultBeerBottle produceNextBeerBottle() throws NoMoreMaltException {
        return null;
    }
}

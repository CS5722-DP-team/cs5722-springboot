package org.ul.dpproj.entity.abstractFactory;

public class MealSetTwoFactory implements SnackFactory {
    @Override
    public Drink createDrink() {
        return new IceBlackTea();
    }

    @Override
    public Staple createStaple() {
        return new OsmanthusCake();
    }

    @Override
    public Double getPrice() {
        return 10.2;
    }
}

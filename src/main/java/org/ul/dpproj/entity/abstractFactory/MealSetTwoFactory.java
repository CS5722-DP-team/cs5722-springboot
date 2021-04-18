package org.ul.dpproj.entity.abstractFactory;

public class MealSetTwoFactory implements SnackFactory {
    @Override
    public Drink createDrink() {
        System.out.println("Creating IceBlackTea");
        return new IceBlackTea();
    }

    @Override
    public Staple createStaple() {
        System.out.println("Creating OsmanthusCake");
        return new OsmanthusCake();
    }

    @Override
    public Double getPrice() {
        return 10.2;
    }

}

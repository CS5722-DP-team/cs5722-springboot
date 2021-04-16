package org.ul.dpproj.entity.abstractFactory;

public class MealSetThreeFactory implements SnackFactory {

    @Override
    public Drink createDrink() {
        return new LatteCoffee();
    }

    @Override
    public Staple createStaple() {
        return new Trimisu();
    }

    @Override
    public Double getPrice() {
        return 15.2;
    }
}

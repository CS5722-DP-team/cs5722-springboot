package org.ul.dpproj.entity.abstractFactory;

public class MealSetOneFactory implements SnackFactory {

    @Override
    public Drink createDrink() {
        return new AmericanoCafe();
    }

    @Override
    public Staple createStaple() {
        return new MatchaMousse();
    }

    @Override
    public Double getPrice() {
        return 13.6;
    }
}

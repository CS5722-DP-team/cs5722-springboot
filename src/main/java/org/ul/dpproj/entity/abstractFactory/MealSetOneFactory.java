package org.ul.dpproj.entity.abstractFactory;

public class MealSetOneFactory implements SnackFactory {

    @Override
    public Drink createDrink() {
        System.out.println("Creating AmericanoCafe");
        return new AmericanoCafe();
    }

    @Override
    public Staple createStaple() {
        System.out.println("Creating MatchaMousse");
        return new MatchaMousse();
    }

    @Override
    public Double getPrice() {
        return 13.6;
    }

}

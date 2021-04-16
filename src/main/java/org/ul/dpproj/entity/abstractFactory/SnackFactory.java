package org.ul.dpproj.entity.abstractFactory;

public interface SnackFactory {

    //produce drink
    Drink createDrink();

    //produce food
    Staple createStaple();

    //get price
    Double getPrice();
}

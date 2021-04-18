package org.ul.dpproj.entity.abstractFactory;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;

public class MealSetThreeFactory implements SnackFactory {

    @Override
    public Drink createDrink() {
        System.out.println("Creating LatteCoffee");
        return new LatteCoffee();
    }

    @Override
    public Staple createStaple() {
        System.out.println("Creating Trimisu");
        return new Trimisu();
    }

    @Override
    public Double getPrice() {
        return 15.2;
    }

}

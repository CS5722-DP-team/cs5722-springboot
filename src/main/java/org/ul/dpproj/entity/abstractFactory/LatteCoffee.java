package org.ul.dpproj.entity.abstractFactory;

public class LatteCoffee extends Drink {

    private static final String name = "LatteCoffee";

    public String getName(){
        return name;
    }
    @Override
    public void show() {
        System.out.println("Latte");
    }
}

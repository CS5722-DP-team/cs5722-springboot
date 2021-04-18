package org.ul.dpproj.entity.abstractFactory;

public class IceBlackTea extends Drink {

    private static final String name = "IceBlackTea";

    public String getName(){
        return name;
    }

    @Override
    public void show() {
        System.out.println("Ice Black Tea");
    }
}

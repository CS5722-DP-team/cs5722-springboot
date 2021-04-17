package org.ul.dpproj.entity.abstractFactory;

/*
Trimisu class
 */
public class Trimisu extends Staple {
    private static final String name = "Trimisu";

    public String getName(){
        return name;
    }
    @Override
    public void show() {
        System.out.println("Trimisu");
    }
}

package org.ul.dpproj.entity.adapter;

//Adaptee
public class Package implements FoodType{
    @Override
    public String foodName() {
        return "A ChildPackage ";
    }
}

package org.ul.dpproj.entity.abstractFactory;

public class OsmanthusCake extends Staple {

    private static final String name = "OSmanthusCake";

    public String getName(){
        return name;
    }

    @Override
    public void show() {
        System.out.println("OsmanthusCake");
    }
}

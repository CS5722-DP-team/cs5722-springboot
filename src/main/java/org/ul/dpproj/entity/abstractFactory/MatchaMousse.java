package org.ul.dpproj.entity.abstractFactory;

/*
MatchaMousse
 */
public class MatchaMousse extends Staple {

    private static final String name = "MatchaMousse";

    public String getName(){
        return name;
    }

    @Override
    public void show() {
        System.out.println("MatchaMousse");
    }
}

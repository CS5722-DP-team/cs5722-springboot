package org.ul.dpproj.entity.memento;

import java.util.ArrayList;

public class Memento {
    public static void main(String[] args) {
        FamilyLunchCaretaker c=new FamilyLunchCaretaker();
        c.cancelFamilyLunch();

        FamilyLunchOriginator o=new FamilyLunchOriginator();
        o.setStaple("Pizza");
        o.setSauce("Salad");
        o.setVegetable("Carrot");
        c.addFamilyLunch(o.createFamilyLunchMemento());

        o.setStaple("Pizza");
        o.setSauce("Salad");
        o.setVegetable("Carrot");
        c.addFamilyLunch(o.createFamilyLunchMemento());

        o.setStaple("Pizza");
        o.setSauce("Salad");
        o.setVegetable("Potato");
        c.addFamilyLunch(o.createFamilyLunchMemento());

        o.setFamilyLunchMemento(c.cancelFamilyLunch());
        o.display();

        o.setFamilyLunchMemento(c.cancelFamilyLunch());
        o.display();

        o.setFamilyLunchMemento(c.cancelFamilyLunch());
        o.display();

    }



}







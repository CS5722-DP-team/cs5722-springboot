package org.ul.dpproj.entity.memento;

import java.util.ArrayList;

// Originator(save:give state to Memento; restore:get the state from memento)
// Memento
// Caretaker get memento;set memento
// multiple lunch
// 保存list中的内容 list中的memento数量
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







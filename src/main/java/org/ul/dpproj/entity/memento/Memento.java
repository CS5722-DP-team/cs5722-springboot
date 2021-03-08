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
class FamilyLunchOriginator{
    private String staple;
    private String sauce;
    private String vegetable;

    public FamilyLunchOriginator() {
    }

    public String getStaple() {
        return staple;
    }

    public void setStaple(String staple) {
        this.staple = staple;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public FamilyLunchMemento createFamilyLunchMemento(){
        return new FamilyLunchMemento(staple,sauce,vegetable);
    }
    public void setFamilyLunchMemento(FamilyLunchMemento memento){
        this.staple = memento.getStaple();
        this.sauce = memento.getSauce();
        this.vegetable = memento.getVegetable();
    }
    public void display(){
        String message = "The last memento is "+this.staple+" "+ this.sauce+" "+this.vegetable;
        System.out.println(message);
    }
}
class FamilyLunchCaretaker{
    private ArrayList<FamilyLunchMemento> list=null;

    public FamilyLunchCaretaker() {
        list=new ArrayList<FamilyLunchMemento>();
    }

    public void addFamilyLunch(FamilyLunchMemento m){
        list.add(m);
    }
    public FamilyLunchMemento cancelFamilyLunch() {
        if(list.isEmpty()) {
            System.out.println("cannot cancel");
            return null;
        }else {
            int index=list.size();
            FamilyLunchMemento m=(FamilyLunchMemento)list.get(index-1);
            list.remove(index-1);
            return m;
        }
    }

}
class FamilyLunchMemento{
    private String staple;
    private String sauce;
    private String vegetable;
    public FamilyLunchMemento(String stable,String sauce,String vegetable){
        this.staple = stable;
        this.sauce = sauce;
        this.vegetable = vegetable;
    }


    public String getStaple() {
        return staple;
    }

    public void setStaple(String staple) {
        this.staple = staple;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }
}
enum Staple{
    PIZZA(1,"Pizza"),
    NOODLE(2,"Noodle"),
    SANDWICH(3,"Sandwich");
    private final int id;
    private final String name;

    Staple(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

enum Sauce{
    SALAD(1,"Salad"),
    KETCHUP(2,"Ketchup"),
    MUSHROOM(3,"Mushroom");
    private final int id;
    private final String name;

    Sauce(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

enum Vegetable{
    POTATO(1,"Pizza"),
    CARROT(2,"Carrot"),
    BROCCOLI(3,"Broccoli");
    private final int id;
    private final String name;

    Vegetable(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}



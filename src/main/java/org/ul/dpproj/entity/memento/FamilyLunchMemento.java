package org.ul.dpproj.entity.memento;

public class FamilyLunchMemento {
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

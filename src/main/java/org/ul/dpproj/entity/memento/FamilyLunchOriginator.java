package org.ul.dpproj.entity.memento;

public class FamilyLunchOriginator {
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
    public FamilyLunchMemento setFamilyLunchMemento(FamilyLunchMemento memento){
        if(memento!=null){
            this.staple = memento.getStaple();
            this.sauce = memento.getSauce();
            this.vegetable = memento.getVegetable();
            return memento;
        }else{
            return null;
        }
    }
    public void display(){
        String message = "The last memento is "+this.staple+" "+ this.sauce+" "+this.vegetable;
        System.out.println(message);
    }
}

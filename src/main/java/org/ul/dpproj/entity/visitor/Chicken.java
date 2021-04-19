package org.ul.dpproj.entity.visitor;

public class Chicken implements BurgerPart{

    private String size;

    public void Chichen(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }
    public Chicken(String size){
        this.size = size;
    }

    @Override
    public void accept(BurgerPartVisitor burgerPartVisitor) {
        burgerPartVisitor.visit(this);
    }
}

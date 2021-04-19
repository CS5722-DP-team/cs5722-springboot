package org.ul.dpproj.entity.visitor;

public class Chicken implements BurgerPart{

    private int size;

    public void Chichen(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    @Override
    public void accept(BurgerPartVisitor burgerPartVisitor) {
        burgerPartVisitor.visit(this);
    }
}

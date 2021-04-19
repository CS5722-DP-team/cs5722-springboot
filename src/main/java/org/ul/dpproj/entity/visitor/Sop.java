package org.ul.dpproj.entity.visitor;

public class Sop implements BurgerPart{

    private String soptype;

    public void setSoptype(String soptype){
        this.soptype = soptype;
    }

    public String getType(){
        return soptype;
    }

    public Sop(String soptype){
        this.soptype = soptype;
    }
    @Override
    public void accept(BurgerPartVisitor burgerPartVisitor) {


        burgerPartVisitor.visit(this);
    }
}

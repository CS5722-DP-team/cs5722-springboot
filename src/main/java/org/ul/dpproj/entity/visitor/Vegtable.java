package org.ul.dpproj.entity.visitor;

public class Vegtable implements BurgerPart{

    private String type;

/*    public void Vegtable(String type){
        this.type = type;
    }*/

    public String getType(){
        return type;
    }

    public Vegtable(String type){
        this.type = type;
    }

    @Override
    public void accept(BurgerPartVisitor burgerPartVisitor) {
        burgerPartVisitor.visit(this);
    }
}

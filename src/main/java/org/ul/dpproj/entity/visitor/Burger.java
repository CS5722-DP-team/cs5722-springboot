package org.ul.dpproj.entity.visitor;

public class Burger implements BurgerPart{

    BurgerPart[] parts;

    public Burger(){
        parts = new BurgerPart[] {new Vegtable(), new Sop(), new Chicken()};
    }

    @Override
    public void accept(BurgerPartVisitor burgerPartVisitor){
        for (int i = 0; i < parts.length;i++){
            parts[i].accept(burgerPartVisitor);
        }
        burgerPartVisitor.visit(this);
    }
}

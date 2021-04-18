package org.ul.dpproj.entity.visitor;

public class Vegtable implements BurgerPart{

    @Override
    public void accept(BurgerPartVisitor burgerPartVisitor) {
        burgerPartVisitor.visit(this);
    }
}

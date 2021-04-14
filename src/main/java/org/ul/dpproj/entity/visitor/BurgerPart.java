package org.ul.dpproj.entity.visitor;

public interface BurgerPart {
    public void accept(BurgerPartVisitor burgerPartVisitor);
}

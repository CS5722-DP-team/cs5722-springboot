package org.ul.dpproj.entity.visitor;

public class BurgerPartDisplayVisitor implements BurgerPartVisitor{

    @Override
    public void visit(Sop sop) {
        System.out.println("Displaying Sop");
    }

    @Override
    public void visit(Chicken chicken) {
        System.out.println("Displaying Chicken:"+chicken.getSize());
    }

    @Override
    public void visit(Vegtable vegtable) {
        System.out.println("Displaying Vegtable:"+vegtable.getType());
    }

    @Override
    public void visit(Burger burger) {
        System.out.println("Displaying Burger");
    }
}

package org.ul.dpproj.entity.visitor;

public interface BurgerPartVisitor {
/*    public void visit(Burger burger);*/
    public void visit(Chicken chicken);
    public void visit(Sop sop);
    public void visit(Vegtable vegtable);
}

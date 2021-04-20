package org.ul.dpproj.entity.builder;

public abstract class ChildrenMealBuilder {
    public abstract ChildrenMealBuilder buildToy();
    public abstract ChildrenMealBuilder buildFood(String food);
    public abstract ChildrenMealBuilder buildDrink(String drink);
    public abstract ChildrenMealBuilder buildVegetable(String vegetable);
    public abstract ChildrenMeal build();
}

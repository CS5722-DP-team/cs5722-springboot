package org.ul.dpproj.entity.builder;

public class ChildrenMealBuilderWithPlane extends ChildrenMealBuilder{
    private ChildrenMeal childrenMeal = new ChildrenMealWithPlane();

    @Override
    public ChildrenMealBuilder buildToy() {
        childrenMeal.setToy();
        return this;
    }

    @Override
    public ChildrenMealBuilder buildFood(String food) {
        childrenMeal.setFood(food);
        return this;
    }

    @Override
    public ChildrenMealBuilder buildDrink(String drink) {
        childrenMeal.setDrink(drink);
        return this;
    }

    @Override
    public ChildrenMealBuilder buildVegetable(String vegetable) {
        childrenMeal.setVegetable(vegetable);
        return this;
    }

    @Override
    public ChildrenMeal build() {
        return childrenMeal;
    }
}

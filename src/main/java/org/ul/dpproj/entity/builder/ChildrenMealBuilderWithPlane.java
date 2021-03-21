package org.ul.dpproj.entity.builder;

public class ChildrenMealBuilderWithPlane extends ChildrenMealBuilder{
    private ChildrenMeal childrenMeal;
    public ChildrenMealBuilderWithPlane(String food, String drink, String vegetable){
        childrenMeal = new ChildrenMeal(food,drink,vegetable);

    }
    @Override
    public void setToy() {
        childrenMeal.setToy("Toy Plane");
    }

    @Override
    public void setBook() {
        childrenMeal.setBook("Book Plane");
    }

    @Override
    public ChildrenMeal getMeal() {
        return this.childrenMeal;
    }
}

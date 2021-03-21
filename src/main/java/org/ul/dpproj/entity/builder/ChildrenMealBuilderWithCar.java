package org.ul.dpproj.entity.builder;

public class ChildrenMealBuilderWithCar extends ChildrenMealBuilder{
    private ChildrenMeal childrenMeal;
    public ChildrenMealBuilderWithCar(String food, String drink, String vegetable){
        childrenMeal = new ChildrenMeal(food,drink,vegetable);

    }
    @Override
    public void setToy() {
        childrenMeal.setToy("Toy Car");
    }

    @Override
    public void setBook() {
        childrenMeal.setBook("Book Car");
    }

    @Override
    public ChildrenMeal getMeal() {
        return this.childrenMeal;
    }
}

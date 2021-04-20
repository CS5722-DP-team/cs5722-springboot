package org.ul.dpproj.entity.builder;

public class ChildrenMealDirector {
    ChildrenMealBuilder builder=null;

    public ChildrenMealDirector(ChildrenMealBuilder builder) {
        this.builder = builder;
    }


    public ChildrenMeal construct(String food,String drink,String vegetable){

        ChildrenMeal meal = builder.buildToy().buildFood(food).buildDrink(drink).buildVegetable(vegetable).build();
        return meal;
    }
}

package org.ul.dpproj.entity.builder;

public abstract class ChildrenMeal {
    protected String toy;
    protected String food;
    protected String drink;
    protected String vegetable;

    protected ChildrenMeal() {
    }


    public abstract void setToy();

    public String getToy() {
        return toy;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }
}

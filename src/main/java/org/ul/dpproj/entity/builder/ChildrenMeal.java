package org.ul.dpproj.entity.builder;

public class ChildrenMeal {
//    一定要有玩具和书籍 其他可以选择
    private String toy;
    private String book;
    private String food;
    private String drink;
    private String vegetable;

    public ChildrenMeal(String food, String drink, String vegetable) {
        this.food = food;
        this.drink = drink;
        this.vegetable = vegetable;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }



    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
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

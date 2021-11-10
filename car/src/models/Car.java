package models;

public class Car {
    public Category category;


    public Car(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Car{" +
                "category=" + category +
                '}';
    }
}
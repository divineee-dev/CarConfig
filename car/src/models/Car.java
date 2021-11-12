package models;

public class Car {
    public Category category;
    public CarModel carModel;
    public Extras extras;
    public Integer price = 0;


    public Car(Category category, CarModel carModel, Extras extras, Integer price) {
        this.category = category;
        this.carModel = carModel;
        this.extras = extras;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }



    @Override
    public String toString() {
        return "Car{" +
                "category=" + category +
                '}';
    }
}
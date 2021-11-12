package models;

public class Category {
    private String name;
    private CarModel model;


    public Category(String name, CarModel model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", model=" + model +
                '}';
    }
}

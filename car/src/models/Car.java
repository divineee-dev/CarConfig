package models;

public class Car {
    public String color;
    public double size;
    public CarModel carModel;


    public Car(String color, double size, CarModel carModel) {
        this.color = color;
        this.size = size;
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", carModel=" + carModel +
                '}';
    }
}
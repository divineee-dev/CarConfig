package models;

public class CarModel {
    private String name;
    private Extras extras;

    public CarModel(String name, Extras extras) {
        this.name = name;
        this.extras = extras;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "name='" + name + '\'' +
                ", extras=" + extras +
                '}';
    }
}

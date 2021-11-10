package models;

public class Extras {
    public String color;
    public String rims;
    public boolean carbon;

    public Extras(String color, String rims, boolean carbon) {
        this.color = color;
        this.rims = rims;
        this.carbon = carbon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRims() {
        return rims;
    }

    public void setRims(String rims) {
        this.rims = rims;
    }

    public boolean isCarbon() {
        return carbon;
    }

    public void setCarbon(boolean carbon) {
        this.carbon = carbon;
    }

    @Override
    public String toString() {
        return "Extras{" +
                "color='" + color + '\'' +
                ", rims='" + rims + '\'' +
                ", carbon=" + carbon +
                '}';
    }
}

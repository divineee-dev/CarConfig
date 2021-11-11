package models;

public class Extras {
    public boolean color;
    public int rims;
    public boolean carbon;

    public Extras(boolean color, int rims, boolean carbon) {
        this.color = color;
        this.rims = rims;
        this.carbon = carbon;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getRims() {
        return rims;
    }

    public void setRims(int rims) {
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

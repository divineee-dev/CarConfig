package models;

public class Extras {
    public int color;
    public int rims;
    public boolean carbon;

    public Extras( boolean carbon, int rims, int color) {
        this.carbon = carbon;
        this.rims = rims;
        this.color = color;
    }

    public boolean isCarbon() {
        return carbon;
    }

    public void setCarbon(boolean carbon) {
        this.carbon = carbon;
    }

    public int getRims() {
        return rims;
    }

    public void setRims(int rims) {
        this.rims = rims;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
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

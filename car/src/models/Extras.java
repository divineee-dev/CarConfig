package models;

public class Extras {
    private String color;
    private String rims;
    private String carbon;

    public Extras( String carbon, String rims, String color) {
        this.carbon = carbon;
        this.rims = rims;
        this.color = color;
    }

    public String isCarbon() {
        return carbon;
    }

    public void setCarbon(String carbon) {
        this.carbon = carbon;
    }

    public String getRims() {
        return rims;
    }

    public void setRims(String rims) {
        this.rims = rims;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

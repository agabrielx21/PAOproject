package main.java.laborator3;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;
    public CandyBox() {
    }
    public CandyBox(String origin, String flavor){
        this.origin = origin;
        this.flavor = flavor;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }

    public float getVolume(){
        return 0;
    }
    public String getFlavor() {
        return flavor;
    }
    public String getOrigin() {
        return origin;
    }
    @Override
    public String toString() {
        return "Class: " + this.getClass().getName() + " flavor: " + this.getFlavor() + ", origin: " + this.getOrigin();
    }
}


package main.java.laborator3;

public class Heidi extends CandyBox{
    Float l;

    public Heidi() {
    }

    public Heidi(Float l) {
        this.l = l;
    }

    public Heidi(String origin, String flavor, Float l) {
        super(origin, flavor);
        this.l = l;
    }

    public Float getL() {
        return l;
    }

    @Override
    public String toString() {
        return "The " + this.getOrigin() + " origin, flavor: " + this.getFlavor() + ", has volume: " + this.getVolume();
    }

    @Override
    public float getVolume() {
        return this.getL() * this.getL() * this.getL();
    }
}

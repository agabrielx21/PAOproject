package main.java.laborator3;

public class Milka extends CandyBox{

    Float R;
    Float G;
    public Milka() {
    }

    public Milka(Float R, Float G) {
        this.R = R;
        this.G = G;
    }

    public Milka(String origin, String flavor, Float R, Float G) {
        super(origin,flavor);
        this.R = R;
        this.G = G;
    }

    public Float getR() {
        return R;
    }

    public Float getG() {
        return G;
    }

    @Override
    public String toString() {
        return "The " + this.getOrigin() + " origin, flavor: " + this.getFlavor() + ", has volume: " + this.getVolume();
    }

    @Override
    public float getVolume() {
        return 3.14f * this.getR() * this.getR() * this.getG();
    }

}

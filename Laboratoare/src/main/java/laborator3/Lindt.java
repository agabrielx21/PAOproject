package main.java.laborator3;

public class Lindt extends CandyBox{
    Float lungime;
    Float latime;
    Float h;
    public Lindt() {
    }
    public Lindt(Float lungime, Float latime, Float h) {
        this.lungime = lungime;
        this.latime = latime;
        this.h = h;
    }
    public Lindt(String origin, String flavor, Float lungime, Float latime, Float h) {
        super(origin, flavor);
        this.lungime = lungime;
        this.latime = latime;
        this.h = h;
    }

    public Float getLungime() {
        return lungime;
    }

    public Float getLatime() {
        return latime;
    }

    public Float getH() {
        return h;
    }

    @Override
    public String toString() {
        return "The " + this.getOrigin() + " origin, flavor: " + this.getFlavor() + ", has volume: " + this.getVolume();
    }

    @Override
    public float getVolume() {
        return this.getLungime() * this.getLatime() * this.getH();
    }
}

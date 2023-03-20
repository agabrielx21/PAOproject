package main.java.laborator3;

import java.util.Vector;

public class CandyBag {
    private final Vector<CandyBox> candyBoxes;

    public CandyBag() {
        candyBoxes = new Vector<CandyBox>();
    }
    public void addCandyBox(CandyBox candyBox) {
        candyBoxes.add(candyBox);
    }

    public void removeCandyBox(CandyBox candyBox) {
        candyBoxes.remove(candyBox);
    }
    public Vector<CandyBox> getCandyBoxes() {
        return candyBoxes;
    }
}

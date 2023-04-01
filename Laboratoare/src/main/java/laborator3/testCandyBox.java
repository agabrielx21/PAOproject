package main.java.laborator3;

public class testCandyBox {
    public static void main(String[] args){
        CandyBox cb1 = new CandyBox();
        System.out.println(cb1.toString());

        CandyBox cb2 = new CandyBox("Menta","Milka");
        System.out.println(cb2);

        System.out.println(cb1.equals(cb2));

        Lindt l1 = new Lindt("Lindt","Marzipan",2.5f,2f,5f);
        System.out.println(l1.toString());

        Milka m1 = new Milka("Milka","Choc",2f,5f);
        System.out.println(m1.toString());

        Heidi h1 = new Heidi("Heidi","Oreo",3f);
        System.out.println(h1.toString());

        CandyBag bag = new CandyBag();
        bag.addCandyBox(l1);
        bag.addCandyBox(m1);
        bag.addCandyBox(h1);
        System.out.println(bag.getCandyBoxes());

    }
}

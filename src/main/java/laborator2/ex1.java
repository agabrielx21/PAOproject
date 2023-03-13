package main.java.laborator2;

public class ex1 {
    public static void main(String[] args) {

        char c = 'c';
        Character cc = c;

        Integer i1 = 4;
        Integer i2 = Integer.valueOf(4);
        Integer i3 = Integer.valueOf("4");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i2 == i3);

        Integer i4 = Integer.valueOf(128);
        Integer i5 = Integer.valueOf("128");
        System.out.println(i4 == i5); // [-128,127] => return false

        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);

        long l1 = Long.parseLong("7777");
        System.out.println(l1);

        boolean b2 = Boolean.parseBoolean("abc");
        System.out.println(b2);

//        Integer badInt = Integer.parseInt("fff");
//        System.out.println(badInt);

        System.out.println("instance of .. ?: " + (i5 instanceof Number));
    }
}

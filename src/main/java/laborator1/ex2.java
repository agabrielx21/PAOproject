package main.java.laborator1;

public class ex2 {
    public static void main(String[] args){
        ex1.main(null);

        ex1 object1 = new ex1();
        object1.setNumeLaborator(1);
        object1.main(null);

        System.out.println(object1.getNumeLaborator());
        System.out.println(object1.numarLaborator);

        ex1 object2 = new ex1();
        object2.setNumeLaborator(2);


    }
}

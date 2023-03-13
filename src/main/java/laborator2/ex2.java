package main.java.laborator2;
import java.util.Scanner;
public class ex2 {

    public static void main(String[] args){
        /*
        Implementare aplicatie care citeste de la tastatura 2 valori : numele, varsta si afiseaza nr pare/impare <= varsta
        de aceeasi paritate cu varsta
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele");
        String name = scanner.nextLine();
        System.out.println("Introduceti varsta");
        Integer varsta = scanner.nextInt();
        System.out.println(name);
        System.out.println(varsta);
        int i = 0;
        if(varsta % 2 == 1){
           i = 1;
        }
        for(int x=i; x<=varsta; x=x+2){
            System.out.println(x);
        }
        scanner.close();

    }
}

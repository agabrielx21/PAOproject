package main.java.laborator2;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args){
        int[] ar1; //recommended
        int ar2 [];
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[6];
        int[] array3 = new int[]{1,2,3,4,5};
        int[] array4 = array1;

        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array4);

        System.out.println("comparatie referinte == : " + (array1 == array3));
        System.out.println("Comparatie continut: " + Arrays.compare(array1, array3));
        System.out.println("Comparatie obiecte: " + Arrays.equals(array1, array3));

        for(int i = 0; i < array1.length ; i++){
            System.out.println(array1[i]);
        }
        System.out.println("-------------------------------");
        for(int i = 0; i < array4.length ; i++){
            System.out.println(array4[i]);
        }
    }
}

package main.java.laborator4;

import java.nio.file.LinkOption;

public class TestInterfete {
}
//        I4
//I2              I3
//        I1

class C1 implements I1{
    @Override
    public void m1(){

    }

    @Override
    public void m2(){

    }
}
interface I1 extends I2, I3{

}
interface I2 extends I4{

}
interface I3 extends I4{

}
interface I4{
    public static final Integer i1 = 0;

    public final String s1 = "abc";

    static final Number n1 = 3.3;

    final StringBuilder sb1 = new StringBuilder();
    Long l1 = 123L;

    void m1();

    default void m2(){
        System.out.println("in I2 m2() ");
    }
    static void m3(){
        System.out.println("static method m3() in I4 ");
    }

    private void m4(){

    }
}
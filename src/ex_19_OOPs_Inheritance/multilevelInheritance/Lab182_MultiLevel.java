package ex_19_OOPs_Inheritance.multilevelInheritance;

public class Lab182_MultiLevel {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        gf.gf();

        System.out.println("-----");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        Son s1 = new Son();
        s1.gf();
        s1.s();
        s1.f();


    }
}

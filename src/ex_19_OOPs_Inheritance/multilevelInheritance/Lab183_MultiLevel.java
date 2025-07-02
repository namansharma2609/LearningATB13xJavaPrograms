package ex_19_OOPs_Inheritance.multilevelInheritance;

public class Lab183_MultiLevel {
    public static void main(String[] args) {
        Son amit = new Son();

        Grandfather g2 = new Son();    // Dynamic Dispatch \
        g2.gf();
        g2.home();

        Father f2 = new Son();
        f2.home();

        amit.s();
        amit.home();
        amit.f();
        amit.gf();
    }
}

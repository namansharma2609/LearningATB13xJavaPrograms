package ex_19_OOPs_Inheritance.multilevelInheritance;

public class Lab184_MultiLevel {
    public static void main(String[] args) {
        Son guggu = new Son();
        System.out.println(guggu.gold_f);

        guggu.home();
        guggu.gf();
        guggu.f();

        Grandfather g2 = new Son();
        g2.gf();
    }
}

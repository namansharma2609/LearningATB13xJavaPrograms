package ex_22_AccessModifiers.police;

public class JrCop1 {
    public static void main(String[] args) {
        Cop jrCop1 = new Cop(100);
        jrCop1.canIShoot();
        jrCop1.gun = 10;
        System.out.println(jrCop1.gun);
        jrCop1.defaultMethod();
    }
}

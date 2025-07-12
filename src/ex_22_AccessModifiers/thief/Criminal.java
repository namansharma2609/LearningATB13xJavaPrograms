package ex_22_AccessModifiers.thief;


import ex_22_AccessModifiers.police.Cop;

public class Criminal {
    public static void main(String[] args) {
        Cop chor = new Cop(100);
        // chor.canIShoot(); as canIShoot is a protected method so it can be accessed within same package or by child class in different package
        // chor.defaultMethod(); as defaultMethod is default method that can be access in same class by child class

    }
}

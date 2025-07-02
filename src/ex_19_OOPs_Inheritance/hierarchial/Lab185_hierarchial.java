package ex_19_OOPs_Inheritance.hierarchial;

public class Lab185_hierarchial {
    public static void main(String[] args) {
        Pramod p1 = new Pramod();
        p1.home();

        Lucky l1 = new Lucky();
        l1.home();
    }

}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Pramod extends Father{
    void h1(){
        System.out.println("2BHK");
    }
}

class Lucky extends Father{
    void h2(){
        System.out.println("4BHK");
    }
}
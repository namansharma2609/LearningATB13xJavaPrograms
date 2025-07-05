package ex_20_OOPs_Polymorphism.overloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperation m1 = new MathOperation();
        int r1 = m1.add(2,3);
        int r2 = m1.add(3,4,6);
        double d1 = m1.add(3.14, 4.56);
        String string1 = m1.add("Naman","Sharma");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(d1);
        System.out.println(string1);
    }
}


class MathOperation{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }
}

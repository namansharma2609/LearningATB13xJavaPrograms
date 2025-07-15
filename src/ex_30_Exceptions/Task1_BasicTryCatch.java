package ex_30_Exceptions;

public class Task1_BasicTryCatch {
    public static void main(String[] args) {

        int a = 0;

        try {
            int b = 10/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
        }
    }
}

package ex_30_Exceptions;

public class Task4_NestedTryCatch {

    public static void main(String[] args) {


        try {
            System.out.println("Entered outer block!!");
            try {
                String name = args[0];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException : Inner block string available!!");
            }
            int b = 0;
            int a = 10/b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : Div by 0 is not allowed!!");
        }
    }
}

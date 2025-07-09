package ex_30_Exceptions;

public class Task2_TryCatchMultipleCatchBlocks {
    public static void main(String[] args) {
        int a = 0;

        try {
            String s = args[0];  //// java.lang.ArrayIndexOutOfBoundsException
            int s1 = Integer.parseInt(s); //java.lang.NumberFormatException: For input string
            int b = 20/a;  //java.lang.ArithmeticException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}

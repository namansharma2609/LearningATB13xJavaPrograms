package ex_30_Exceptions;

public class Task10_TryWithMultipleStatements {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 20/a;

            String s = null;
            s.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}

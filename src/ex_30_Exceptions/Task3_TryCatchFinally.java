package ex_30_Exceptions;

import java.util.Scanner;

public class Task3_TryCatchFinally {

    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter the n: ");

        int n = sc.nextInt();

        try {
            int b = 10/n;
        } catch (ArithmeticException e) {
            System.out.println("Div by 0 is not allowed!!");
        } finally {
            System.out.println("End of program!!!");
        }


    }
}

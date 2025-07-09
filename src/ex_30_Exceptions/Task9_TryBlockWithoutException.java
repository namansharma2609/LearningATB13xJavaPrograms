package ex_30_Exceptions;

import java.util.Scanner;

public class Task9_TryBlockWithoutException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        try {
            int b=10/a;
            System.out.println("Number is Divisible by: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0 is not allowed!!!");
        }
    }
}

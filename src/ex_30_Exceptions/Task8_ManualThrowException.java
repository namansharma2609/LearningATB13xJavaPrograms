package ex_30_Exceptions;

import java.util.Scanner;

public class Task8_ManualThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        try {
            validateAge(a);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int a){
        if (a == 0){
            throw new ArithmeticException("Found Arithmetic Error as a equals 0");
        }
        else{
            System.out.println("Yah!! You can go to Goa");
        }
    }
}

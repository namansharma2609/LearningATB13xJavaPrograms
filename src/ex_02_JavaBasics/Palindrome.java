package ex_02_JavaBasics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value: ");
        String str= scanner.next();

        int strLength = str.length();
        String revstr="";

        for(int i= strLength-1;i>=0;i--){
            revstr = revstr + str.charAt(i);
        }

        if (str.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println(str + " is a palindrome");
        }
        else {
            System.out.println(str + " is not a palindrome");
        }
    }
}

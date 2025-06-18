package ex_02_JavaBasics;

import java.util.Scanner;

public class Lab028_VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = scanner.next().toLowerCase().charAt(0);

        if (c == 'a' || c== 'e' || c=='i' || c=='o' || c=='u'){
            System.out.println(c + " is a vowel");
        }
        else if (c >= 'a' && c <= 'z'){
            System.out.println(c + " is a consonant");
        }
        else{
            System.out.println("Invalid Character entered !!");
        }
    }
}

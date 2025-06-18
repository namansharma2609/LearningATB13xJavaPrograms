package ex_02_JavaBasics;

import java.util.Scanner;

public class Lab029VowelCheckSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");

        char c = scanner.next().toLowerCase().charAt(0);

        if ( !Character.isLetter(c)){
            System.out.println("Invalid Character entered");
        }

        else{
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(c + " is a vowel");
                    break;
                default:
                    System.out.println(c + " is a consonants");
            }
        }
    }
}

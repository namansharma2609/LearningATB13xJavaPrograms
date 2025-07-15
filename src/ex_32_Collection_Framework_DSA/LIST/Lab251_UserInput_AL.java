package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_UserInput_AL {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> ages = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name: ");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age: ");
            Integer age =scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter a new record: ");
            continueInput = scanner.nextLine();

        }

        for (Object o: names){
            System.out.println(o);
        }

        for (Object o1: ages){
            System.out.println(o1);
        }

        scanner.close();

    }
}

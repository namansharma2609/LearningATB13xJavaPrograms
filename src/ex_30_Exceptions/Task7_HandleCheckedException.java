package ex_30_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task7_HandleCheckedException {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("H:abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception!!");        }
    }
}

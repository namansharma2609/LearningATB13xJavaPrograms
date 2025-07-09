package ex_30_Exceptions;

public class Task5_GenericCatch {

    public static void main(String[] args) {

        try {
            int a=0;
            int b=20/a;
        } catch (Exception e){
            System.out.println("Arithmetic Exception exists");
        }

        try {
            String name = null;
            name.trim();
        }
        catch (Exception e){
            System.out.println("Null Point Exception exists!!");
        }
    }
}

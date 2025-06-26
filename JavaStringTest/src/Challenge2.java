public class Challenge2 {
    public static void main(String[] args) {
        String String1 = "Hello";
        String String2 = "hello";
        String String3 = "Hello";

        // Using == operator
        System.out.println(String1 == String2);
        System.out.println(String1 == String3);
        System.out.println(String2 == String3);

        // Using equals() operator
        System.out.println(String1.equals(String2));
        System.out.println(String2.equals(String3));
        System.out.println(String1.equals(String3));

        //Using equalsIgnoreCase() operator
        System.out.println(String1. equalsIgnoreCase(String2));
        System.out.println(String2. equalsIgnoreCase(String3));
        System.out.println(String1. equalsIgnoreCase(String3));

        //Using compareTo() operator
        System.out.println(String1. compareTo(String2));
        System.out.println(String2. compareTo(String3));
        System.out.println(String1. compareTo(String3));
    }
}

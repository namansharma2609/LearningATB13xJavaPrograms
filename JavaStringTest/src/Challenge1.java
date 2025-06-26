public class Challenge1 {
    public static void main(String[] args) {
        String s = "Hello";

        String s1 = s.concat(" World!");
        System.out.println(s1);

        int length = s.length();
        System.out.println(length);

        String sub=s1.substring(3);
        System.out.println(sub);

        char c = s1.charAt(4);
        System.out.println(c);
    }
}

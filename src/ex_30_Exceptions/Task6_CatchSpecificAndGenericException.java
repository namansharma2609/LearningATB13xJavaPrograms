package ex_30_Exceptions;

public class Task6_CatchSpecificAndGenericException {
    public static void main(String[] args) {
        try {
            String s = null;
            s.trim();
        } catch (Exception e) {
            System.out.println("Using Exception e");
        }

        try {
            String s1 = null;
            s1.trim();
        } catch (NullPointerException e) {
            System.out.println("Using NullPoint Exception e");        }
    }
}

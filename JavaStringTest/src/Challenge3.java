public class Challenge3 {

    public static void main(String[] args) {
        //Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" Java");
        stringBuilder.append(" World!");

        String welcome1 = stringBuilder.toString();
        System.out.println("StringBuilder Output: " + welcome1);

        //Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" Java");
        stringBuffer.append(" World!");

        String welcome2 = stringBuffer.toString();
        System.out.println("StringBuffer Output: "+welcome2);

        //Using String Concatention
        String welcome3 = "Hello" + " Java" + " World!";
        System.out.println("String Concatention Output: "+ welcome3);
    }
}

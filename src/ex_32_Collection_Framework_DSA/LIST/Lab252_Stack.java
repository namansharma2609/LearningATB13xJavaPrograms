package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {

        Stack s1 = new Stack();
        System.out.println(s1.isEmpty());
        s1.add("python");
        s1.add("java");
        s1.add("C++");
        s1.add("Jenkins");
        s1.add(112);

        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.push(100));
        System.out.println(s1);
    }
}

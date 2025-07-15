package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab245_LL {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("name");
        list.add("address");
        list.add("contact");
        list.add("identity proof");
        list.add("city");
        // list.add(123);  cannot add different data type

        System.out.println("LinkedList -> " + list);
        System.out.println("LinkedList size before removal -> "+list.size());

        System.out.println("---------------------------");
//        list.remove(7);
        list.removeLast();
        System.out.println("LinkedList after removal -> "+ list);
        System.out.println("LinkedList size after removal -> "+list.size());

    }
}

package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab241_LIST {
    public static void main(String[] args) {

        // List list = new ArrayList();   //Dynamic Dispatch
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(123);
        list.add("world");
        list.add(true);

        System.out.println(list);
    }
}

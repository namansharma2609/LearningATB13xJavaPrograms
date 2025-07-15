package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("name");
        arrayList.add("age");
        arrayList.add(123);
        arrayList.add("name"); //Duplicate value are allowed
        arrayList.add(null);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.get(2));

        System.out.println("-----------------");

        List l = new ArrayList<>(); //Dynamic Dispatch
        l.add("123");
        l.add(123);
        l.add("data");
        l.add(true);
        l.add(null);

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());

    }
}

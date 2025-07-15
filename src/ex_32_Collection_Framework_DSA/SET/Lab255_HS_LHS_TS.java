package ex_32_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab255_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        // Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc


        hs.add("amit");
        hs.add("lucky");
        hs.add(null);
        //hs.add(123);
        hs.add("amit");
        System.out.println("HashSet -> "+hs);


        System.out.println("-----------------");
        System.out.println("Using for each loop");

        for (Object o: hs){
            System.out.println(o);
        }

        System.out.println("------------------");
        System.out.println("Using iterator method");

        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");


        //LinkedHashSet
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        Set lhs = new HashSet<>();
        lhs.add("apple");
        lhs.add("banana");
        lhs.add("orange");
        lhs.add(123);
        lhs.add(null);
        lhs.add(true);
        lhs.add("apple");
        lhs.add("banana");
        System.out.println("LinkedHashSet -> "+lhs);


        System.out.println("------------------------------");

        Set ths = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ths.add("apple");
        ths.add("melon");
        ths.add("banana");
        ths.add("Apricot");
        ths.add("mango");
        ths.add("guava");
        //ths.add(1243); Cannot store different data types as natural sorting is impossible on different data type.
        System.out.println("Tree HashSet -> "+ ths);
    }
}

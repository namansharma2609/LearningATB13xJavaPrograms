package ex_32_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {

        Vector vector = new Vector<>();
        vector.add("item1");
        vector.add("item2");
        vector.add("item3");
        vector.add("item4");
        vector.add(1234);

        System.out.println(vector);
        System.out.println(vector.size());

        System.out.println("------------------");

        System.out.println("Using Iterator :");
        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("-----------------------------");
        while (listIterator.hasPrevious()){              /// Reverse Order
            System.out.println(listIterator.previous());
        }

        System.out.println("------------------------------");
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

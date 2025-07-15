package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL2 {
    public static void main(String[] args) {

        List myList = new ArrayList(5);
        List myList0 =new ArrayList();     // Arrays Format - Continuous

        List myList1 = new LinkedList();   //Doubly LinkedList

        myList1.add(2);
        myList1.add("amit");
        myList1.add("dutta");
        myList1.add("ritwik");
        myList1.add(null);
        myList1.add(false);
        System.out.println(myList1);

        System.out.println(myList1.isEmpty());
        System.out.println(myList1.size());
        System.out.println(myList1.indexOf(null));
        System.out.println(myList1.contains("dutta"));

        System.out.println("------------------------");

        Iterator iterator = myList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

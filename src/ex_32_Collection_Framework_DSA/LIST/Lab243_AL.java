package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lab243_AL {
    public static void main(String[] args) {

        List l = new ArrayList<>(10);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(1);

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains(3));
        System.out.println(l.isEmpty());
        System.out.println(l.indexOf(1));
        System.out.println(l.lastIndexOf(1));

        System.out.println("-------------------");


        for(int i =0;i< l.size();i++){
            System.out.println(l.get(i));
        }


        System.out.println(l);
        System.out.println(l.size());


        System.out.println("-------------------");

        for (Object o: l){
            System.out.println(o);
        }

        l.remove(3);
        System.out.println(l.size());
        System.out.println(l.isEmpty());

    }
}

package ex_32_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {

        Vector v = new Vector<>();
        Vector v1 = new Vector();

        v.add("Pramod");
        v.add("Dutta");
        v.add(123);
        v.add(true);
        System.out.println(v);

        for (int i =0; i<v.size();i++){
            System.out.println(v.get(i));
        }

        System.out.println(" ----  For  Each Loop ");

        for(Object o:v){
            System.out.println(o);
        }

        System.out.println("----- Using Iterator");

        Iterator iterator  = v.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }


        System.out.println(" ----  Enumeration ");

        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


    }
}

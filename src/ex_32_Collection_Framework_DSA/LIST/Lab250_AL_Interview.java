package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab250_AL_Interview {
    public static void main(String[] args) {

        List marks =new ArrayList<>();
        marks.add(95);
        marks.add(94);
        marks.add(85);
        marks.add(99);
        marks.add(92);
        System.out.println(marks);


        Collections.sort(marks);   //Sorting of list
        System.out.println("After sorting -> " + marks);

        Collections.sort(marks,Collections.reverseOrder());   // Reverse sorting of list
        System.out.println("After reverse sort -> "+ marks);

    }
}

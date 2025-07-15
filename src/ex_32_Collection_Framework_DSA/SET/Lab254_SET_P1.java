package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.Set;

public class Lab254_SET_P1 {
    public static void main(String[] args) {

        Set hs = new HashSet<>();
        hs.add(123);
        hs.add("name");
        hs.add(true);
        hs.add(null);
        hs.add("Dutta");

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains(null));
        System.out.println(hs.isEmpty());
    }
}

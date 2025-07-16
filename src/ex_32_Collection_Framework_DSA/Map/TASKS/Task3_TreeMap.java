package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.*;

public class Task3_TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ravi",80);
        map.put("Anjali",95);
        map.put("Dipak",75);

        System.out.println("Unsorted HashMap : " + map);

        Map<String,Integer> treeMap  = new TreeMap<>(map);
        System.out.println("Sorted TreeMap By Keys : " );
        for (Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }

    }
}

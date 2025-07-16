package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.*;

public class Task7_StartWithA {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Anjali");
        map.put(102, "Dipak");
        map.put(103,"Aman");
        map.put(104,"Ravi");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            if(entry.getValue().startsWith("A")){
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

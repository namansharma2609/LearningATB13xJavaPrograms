package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.*;
import java.util.Iterator;


public class Task2_HashMapIterate {
    public static void main(String[] args) {
        Map<String,String> hsp = new LinkedHashMap();

        hsp.put("Name", "Dipak");
        hsp.put("Role","Tester");
        hsp.put("Level","Senior");


        System.out.println("Using entrySet()");
        for(Map.Entry<String, String> entry: hsp.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("-----------------");

        System.out.println("Using keySet()");
        for(String key : hsp.keySet()){
            String value = hsp.get(key);
            System.out.println(key + "->" + value);
        }

        System.out.println("-----------------");

        System.out.println("Using Iterator");

        Iterator<Map.Entry<String,String>> iterator = hsp.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

    }
}

package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.*;

public class Task1_HashMap {
    public static void main(String[] args) {
        String str = "java is easy and java is powerful";

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c: str.toCharArray()){
            if (c == ' ') continue;
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        System.out.println(freqMap);
    }
}

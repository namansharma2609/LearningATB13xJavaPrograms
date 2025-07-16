package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.HashMap;
import java.util.Map;

public class Task8_MostFrequentCharacter {
    public static void main(String[] args) {

        String input = "aaaabbbcc";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        char maxChar = ' ';
        int maxCount  = 0;

        for (Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() > maxCount){
                maxCount = e.getValue();
                maxChar = e.getKey();
            }
        }
        System.out.println("Most Frequent Character is '"+ maxChar  + "' and it has occured " + maxCount + " times");


    }
}

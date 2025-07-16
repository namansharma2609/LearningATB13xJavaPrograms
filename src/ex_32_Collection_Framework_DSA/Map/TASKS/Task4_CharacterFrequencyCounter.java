package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.HashMap;
import java.util.Map;

public class Task4_CharacterFrequencyCounter {
    public static void main(String[] args) {

        String input = "aabbccddeeff";

        Map<Character,Integer> map = new HashMap<>();
        for (char c: input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}

package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.*;

public class Task5_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "aabbccdeeff";

        Map<Character, Integer> map =new HashMap<>();

        for(char c : input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(var e: map.entrySet()){
            if(e.getValue() ==1){
                System.out.println("First non-repeated character is: " + e.getKey());
            }
        }
    }
}

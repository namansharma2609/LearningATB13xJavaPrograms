package ex_32_Collection_Framework_DSA.Map.TASKS;

import java.util.*;

public class Task6_GroupWordsbyLength {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Java", "is", "fun", "cool", "Hi");

        Map<Integer, List<String>> grp = new HashMap<>();

        for(String word : input){
            int len = word.length();
            grp.computeIfAbsent(len, k-> new ArrayList<>()).add(word);
        }
        System.out.println(grp);
    }
}

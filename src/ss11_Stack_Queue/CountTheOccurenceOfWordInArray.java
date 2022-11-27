package ss11_Stack_Queue;

import java.util.Scanner;
import java.util.TreeMap;

public class CountTheOccurenceOfWordInArray {
    public static void main(String[] args) {
        countWords();

    }

    private static void countWords() {
        String sentence = "hi My name is my MY";
        String[] sentenceSplit = sentence.split(" ");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < sentenceSplit.length; i++) {
            String key = sentenceSplit[i].toUpperCase();
            if (treeMap.containsKey(key)) {
                int count = treeMap.get(key);
                treeMap.put(key,count+1);
            } else treeMap.put(key,1);
        }
        System.out.println(treeMap);
    }

    /*System.out.println("Input a character");
        Scanner character = new Scanner(System.in);

        String[] array = {"a","b","a","c"};
        int countOccurence = 0;

        for (int i = 0; i < array.length; i++) {
            //countOccurence = 0;
            if (character.equals(array[i])) {
                countOccurence++;
            }
            System.out.println(countOccurence);
        }*/
    
}

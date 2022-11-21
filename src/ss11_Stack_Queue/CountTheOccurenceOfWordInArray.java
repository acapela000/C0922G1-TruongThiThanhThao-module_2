package ss11_Stack_Queue;

import java.util.Scanner;

public class CountTheOccurenceOfWordInArray {
    public static void main(String[] args) {
        System.out.println("Input a character");
        Scanner character = new Scanner(System.in);

        String[] array = {"a","b","a","c"};
        int countOccurence = 0;

        for (int i = 0; i < array.length; i++) {
            //countOccurence = 0;
            if (character.equals(array[i])) {
                countOccurence++;
            }
            System.out.println(countOccurence);
        }

    }
}

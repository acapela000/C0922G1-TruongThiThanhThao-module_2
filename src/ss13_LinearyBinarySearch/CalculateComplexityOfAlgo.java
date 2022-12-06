package ss13_LinearyBinarySearch;

import java.util.Scanner;

public class CalculateComplexityOfAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a string ");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[109];

        for (int i = 0; i < inputString.length(); i++) {
            int check= inputString.charAt(i);
            frequentChar[check] += 1;
        }

        int max = 0;
        char character = 'c';
        for (int i = 0; i < 109; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("'" + character + "' has highest occurences with: " + max + " times");
    }

}

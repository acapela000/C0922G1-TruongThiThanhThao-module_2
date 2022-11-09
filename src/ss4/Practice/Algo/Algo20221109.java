package ss4.Practice.Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Algo20221109 {
    public static void main(String[] args) {
        System.out.println("Input x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = {8, 7, 2, 5, 3, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
                if (x == (arr[i] + arr[j])) {
                    System.out.println("result is " + arr[i] + "," + arr[j]);
                }
        }
    }
}

package ss2.Exercise;

import java.util.Scanner;

public class PrimeNumberTill100 {
    public static void main(String[] args) {

//        int array[] = new int[100];

        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " is a prime number");
            }
        }
    }
}


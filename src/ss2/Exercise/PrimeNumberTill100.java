package ss2.Exercise;

import java.util.Scanner;

public class PrimeNumberTill100 {
    public static void main(String[] args) {
        System.out.println("Input a number");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int array[] = new int[100];
            for (int i = 2; i < 100; i++) {
                boolean isPrime = true;
                if (number % i == 0) {
                    isPrime = false;
                }
                if (isPrime) {
                    System.out.println(array[i] + " is a prime number");
                }
            }
        }
    }


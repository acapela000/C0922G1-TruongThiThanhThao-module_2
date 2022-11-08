package ss2.Exercise;

import java.util.Scanner;

public class PrimeNumberTill20 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử");
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int count = 0;
        int N = 2;
        int arr[] = new int[numbers];

        while (true) {
            boolean isPrime = true;
            for (int i = N - 1; i >= 2; i--) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                arr[count - 1] = N;
            }

            if (count >= numbers) break;
            N++;
        }

        for (int numb :
                arr) {
            System.out.print(numb + " ");
        }
    }
}
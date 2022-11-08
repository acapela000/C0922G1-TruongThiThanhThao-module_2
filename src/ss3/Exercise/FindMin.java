package ss3.Exercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        System.out.println("Input the number of elements U want in the array");
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("Input the " + (i+1) + " element");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int size = array.length;
        int min = array[0];
        for (int number: array) {
            System.out.println(number);
            for (int i = 2; i < numbers; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        System.out.println("The min is " + min);
    }
}

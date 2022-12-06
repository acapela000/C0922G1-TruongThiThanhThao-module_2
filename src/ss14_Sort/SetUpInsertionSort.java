package ss14_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class SetUpInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter list size: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        System.out.println("Enter " + array.length + " value: ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Your input list: " + Arrays.toString(array));
        System.out.println(Arrays.toString(insertSort(array)));
    }
    public static int[] insertSort(int[] array) {
        int pos;
        int x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        return array;
    }

}

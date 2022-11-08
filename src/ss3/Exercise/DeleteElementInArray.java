package ss3.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array = {1,3,3,4,5,6,7};
        System.out.println("Input a number u want to delete in array");
        Scanner sc = new Scanner(System.in);
        int elementToBeDeleted = Integer.parseInt(sc.nextLine());
        int[] newArr = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToBeDeleted) {
                newArr[counter] = array[i];
                counter++;
            }
        }
        System.out.println("The array after be deleted an input element is " + Arrays.toString(newArr));
    }
}

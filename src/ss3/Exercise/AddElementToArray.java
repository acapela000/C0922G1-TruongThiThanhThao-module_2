package ss3.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        System.out.println("Input the numbers of elements in the array U want");
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int[] array = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("Input the " + (i + 1) + " element");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int size = array.length;
        for (int number : array) {
            System.out.println(number);
        }
        System.out.println("Input a number U want to add to the array");
        int addNum = Integer.parseInt(sc.nextLine());
        System.out.println("Input the index of the number U want to add to the array");
        int index = Integer.parseInt(sc.nextLine());
        int[] newArr = new int[array.length+1];
        if (index > -1 && index < newArr.length) {
            for (int i = 0; i < newArr.length; i++) {
                if (index == i) {
                    newArr[i] = addNum;
                } else if (i > index) {
                    newArr[i] = array[i-1];
                } else {
                    newArr[i] = array[i];
                }
            }
        }
        System.out.println("The array after added " + addNum + " is " + Arrays.toString(newArr));
    }
}

// [29,93,93] 2->28
// [29,93,28,]
package ss11_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseTheArray {
    public static void main(String[] args) {
        System.out.println("Input a word");
        Scanner sc = new Scanner(System.in);

        //int[] array = new int[];
        Stack<Scanner> stack = new Stack<>();
        stack.push(sc);
        System.out.println(stack);
        /*for (int i = 1; i < array.length; i++) {
            stack.push(array[i]);

        } return stack;*/

        //System.out.println(stack);

    }
}

package ss11_Stack_Queue;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stackBeforeReverse = new Stack<>();

        for (int i = 0; i < number; i++) {
            System.out.print("Input " + (i+1) + " integer: ");
            stackBeforeReverse.push(Integer.parseInt(sc.nextLine()));
        }
        Iterator<Integer> iterator = stackBeforeReverse.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
        Stack<Integer> temporaryStack = new Stack<>();
        Stack<Integer> stackAfterReverse = new Stack<>();

        int temp;
        for (int indexOfStack = 0; indexOfStack < number; indexOfStack++) {
            stackAfterReverse.push(stackBeforeReverse.pop());
//            temp = temporaryStack.push(stackBeforeReverse.pop());
//            stackAfterReverse.push(temporaryStack.push(temp));
//            stackAfterReverse.push(stackBeforeReverse.pop());
        }
        System.out.println("After reverse: " + stackAfterReverse);
    }
}

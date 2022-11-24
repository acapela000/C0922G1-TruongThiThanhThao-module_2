package ss15_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleMain {
    public static void main(String[] args) {
        int side1, side2, side3;
        boolean askAgain = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Input side 1: ");
                side1 = sc.nextInt();
                System.out.print("Input side 2: ");
                side2 = sc.nextInt();
                System.out.print("Input side 3: ");
                side3 = sc.nextInt();
                try {
                    checkTriangle(side1,side2,side3);
                    askAgain = false;
                } catch (IllegalTriangleException k) {
                    System.out.println(k.getMessage());
                    System.out.println("Try again");
                    askAgain = true;
                }
            } catch (InputMismatchException y) {
                System.out.println("The side must be an integer");
                askAgain = true;
                sc.nextLine();
            }
        } while (askAgain);
    }

    public static void checkTriangle(int side1,int side2,int side3) throws IllegalTriangleException {
        if (side1+side2 <= side3 || side1+side3 <= side2 || side2+side3 <= side1) {
            throw new IllegalTriangleException();
        } else System.out.println("Legal Triangle");
    }
}

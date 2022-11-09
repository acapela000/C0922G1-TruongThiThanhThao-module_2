package ss4.Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the width: ");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        System.out.println("Input the height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle " + rectangle.display());
        System.out.println("The area of rectangle: " +rectangle.getArea());
        System.out.println("The perimeter of rectangle: "+rectangle.getPerimeter());

    }

}

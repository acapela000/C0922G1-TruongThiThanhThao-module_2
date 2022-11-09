package ss4.Exercise;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        System.out.println("Input a");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();
        System.out.println("Input c");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();

        if (delta < 0) {
            System.out.println("the equation has no roots");
        } else if (delta == 0) {
            double root1 = equation.getRoot1();
            System.out.println("1 nghiem = " + root1);
        } else {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("nghiem 1 = " + root1);
            System.out.println("nghiem 2 = " + root2);
        }

        System.out.println("The first ? is "+equation.getRoot1());
        System.out.println("The second ? is "+equation.getRoot2());
        System.out.println("The discriminant is "+equation.getDiscriminant());

    }
}

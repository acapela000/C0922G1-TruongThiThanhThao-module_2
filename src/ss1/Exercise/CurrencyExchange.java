package ss1.Exercise;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        double vnd = 23000;
        System.out.println("Input the number of usd u want to exchange");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        System.out.println("The money u got is " + usd*vnd);
    }
}

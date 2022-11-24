package ss15_Exception.online;

import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;
import javafx.scene.input.DataFormat;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Test_IllegalTriangle {
    public static void main(String[] args) throws DatatypeException {
        Scanner sc = new Scanner(System.in);
        int side1;
        int side2;
        int side3;

        do {
            try {
                System.out.print("Input side 1: ");
                side1 = Integer.parseInt(sc.nextLine());
                System.out.print("Input side 2: ");
                side2 = Integer.parseInt(sc.nextLine());
                System.out.print("Input side 3: ");
                side3 = Integer.parseInt(sc.nextLine());

                if (((side1 + side2) >= side3) || ((side2 + side3) >= side1) || ((side1 + side3) >= side2)) {
                    System.out.println("Triangle is legal");
                }
                break;
            } catch (NumberFormatException e) { //nhap chu thi bi loi
                System.out.println("Triangle is illegal");
            }
        } while (true);
    }
}

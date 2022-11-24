package ss15_Exception.online;

import java.util.Scanner;

public class IllegalTriangleExceptionMain extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IllegalTriangleSideCheck check = new IllegalTriangleSideCheck();

        try {
            System.out.print("Input side 1: ");
            int side1 = Integer.parseInt(sc.nextLine());
            System.out.print("Input side 2: ");
            int side2 = Integer.parseInt(sc.nextLine());
            System.out.print("Input side 3: ");
            int side3 = Integer.parseInt(sc.nextLine());

            try {
                check.checkTriangleSide(side1, side2, side3);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                //System.out.println("Side is less than 0 or sum of 2 sides less than the another side");
            }
        } catch (Exception ex) {
            System.out.println("Wrong! Not match with format."); //nhap chu thi no chay ra cai nay
        }

        sc.close();

       /* int side1;
        int side2;
        int side3;
        int[] arr = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Input side " + (i+1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        side1 = Integer.parseInt(sc.nextLine());
        side2 = Integer.parseInt(sc.nextLine());
        side3 = Integer.parseInt(sc.nextLine());
        do {
            if (((side1+side2) <= side3) || ((side2+side3) <= side1) || ((side1+side3) <= side2)) {

                    System.out.print("Side is less than 0 or sum of 2 sides less than the another side");
                try {

                } catch (IllegalTriangleException) {
                    System.out.println("Side is less than 0 or sum of 2 sides less than the another side");
                }
            }
        } while (((side1+side2) <= side3) || ((side2+side3) <= side1) || ((side1+side3) <= side2));
*/
    }

}

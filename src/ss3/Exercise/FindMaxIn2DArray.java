package ss3.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        System.out.println("Input the row of the matrix");
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Input the column of the matrix");
        int columns = Integer.parseInt(sc.nextLine());

        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("nhap i = " + i + " j = " + j);
                array[i][j] = sc.nextInt();
            }
        }
        //System.out.println(Arrays.toString(array)); 7D  million 1000000
        int max = -9999;
        for (int i = 0; i < array.length; i++) { // O(n^7)
            for (int j = 0; j < array[i].length; j++) {
                //[[1,2],[2,1,4],[1,2]]
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
       System.out.println("The max of the array is " + max);
    }
}

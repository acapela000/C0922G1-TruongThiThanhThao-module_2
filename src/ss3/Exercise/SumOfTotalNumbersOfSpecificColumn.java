package ss3.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTotalNumbersOfSpecificColumn {
    public static void main(String[] args) {
        //in advanced array
        int[][] array = {{0,1,2},{3,4,5}};
        String arrayString = "";
        for (int i = 0; i < array.length; i++) {
            arrayString += Arrays.toString(array[i]);
        }
        System.out.println("The 2D array is [" + arrayString+"]");
        //System.out.println("The 2D array is [" + Arrays.toString(array[0])+","+Arrays.toString(array[1])+"]"); //chưa in cái mảng ra đc
        System.out.println("Input the position of column U want to sum the total numbers");
        Scanner sc = new Scanner(System.in);
        int posOfColCase1 = Integer.parseInt(sc.nextLine());

        //create array from user's input
        System.out.println("Input the number of rows of 2D Array");
        int row = sc.nextInt();
        System.out.println("Input the number of columns of 2D Array");
        int column = sc.nextInt();
        int[][] arr_2D = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Input the value you want to add in the position array["+i+"]["+j+"]");
                int numberInArray = sc.nextInt();
                arr_2D[i][j] = numberInArray;
            }
        }

        System.out.println("Input the position of the column you want to sum");
        int posOfColCase2 = sc.nextInt();

        // bai tap
        int sumCase1 = calculateSum(array, posOfColCase1);
        System.out.println("Sum of the total numbers in column " + posOfColCase1 + " is " + sumCase1);


        int sumCase2 = calculateSum(arr_2D, posOfColCase2);
        System.out.println("Sum of the total numbers in column " + posOfColCase2 + " is " + sumCase2);
    }

    public static int calculateSum(int[][] array, int col) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length > col){//7
                sum += array[i][col];
                //[[1,2,3],[2,4,5]]
            }
        }
        return sum;
    }

}

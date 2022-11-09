package ss3.Exercise;

public class SumOfTotalNumberOfVertic {
    public static void main(String[] args) {
        int[][] array = {{1,5,9},{7,8,9},{1,2,3}};
        int sumVertic1 = 0;
        int sumVertic2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumVertic1 += array[i][j];
                }
                if (j == array.length-1-i) {
                    sumVertic2 += array[i][j];
                }
            }
        }
        System.out.println("Sum of numbers of vertic 1 = " + sumVertic1);
        System.out.println("Sum of numbers of vertic 2 = " + sumVertic2);
    }
}

package by.itstep.sasha.stage15.task02.model;

public class MatrixManager {
    public static int countEvenValuesBelowFirstDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int countOddValuesBelowFirstDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}



package by.itstep.sasha.stage15.task03.model;

public class MatrixLogic {

    public static int countPositiveValuesAboveSecondDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int countNegativeValuesAboveSecondDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

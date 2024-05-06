package by.itstep.sasha.stage15.task04.model;

public class Matrix {
    public static boolean checkValueBelowSecondaryDiagonal
            (int[][] matrix, int value) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - i; j < matrix[i].length; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
}

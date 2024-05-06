package by.itstep.sasha.stage15.task02.util;

public class Convertor {
    public static String convertMatrix(int[][] matrix){
        StringBuilder builder = new StringBuilder();

        for (int[] array : matrix) {
            for (int number : array) {
                builder.append(number).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}

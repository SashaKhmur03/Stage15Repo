package by.itstep.sasha.stage15.task04.util;

import java.util.Random;
import java.util.Scanner;

import static by.itstep.sasha.stage15.task04.model.Matrix.
        checkValueBelowSecondaryDiagonal;

public class Initializer {
    public static final Random RND;

    static {
        RND = new Random();
    }

    public static void initMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = RND.nextInt(10);
            }
        }

        int value = RND.nextInt(10);

        boolean hasValue = checkValueBelowSecondaryDiagonal(matrix, value);

        if (hasValue) {
            System.out.println("Value " + value + " found ");
        } else {
            System.out.println("Value " + value + " not found ");
        }
    }

    public static int readIntWithValidation(Scanner scanner, String message) {
        int num;
        while (true) {
            System.out.print(message);
            try {
                num = scanner.nextInt();
                if (num > 1) {
                    break;
                } else {
                    System.out.println("Error!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
        }
        return num;
    }
}

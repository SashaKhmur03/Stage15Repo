package by.itstep.sasha.stage15.task04.controller;

import by.itstep.sasha.stage15.task04.model.Matrix;
import by.itstep.sasha.stage15.task04.util.Convertor;
import by.itstep.sasha.stage15.task04.util.Initializer;
import by.itstep.sasha.stage15.task04.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage15.task04.util.Initializer.
        readIntWithValidation;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");
        int[][] matrix =  new int[rows][columns];

        int value = 0;

        Initializer.initMatrix(matrix);
        Printer.print(Convertor.convert(matrix));
        Printer.print("null value: "
                + Matrix.checkValueBelowSecondaryDiagonal(matrix, value));
    }
}

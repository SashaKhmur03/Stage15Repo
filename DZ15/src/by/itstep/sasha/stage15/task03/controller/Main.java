package by.itstep.sasha.stage15.task03.controller;

import by.itstep.sasha.stage15.task03.model.MatrixLogic;
import by.itstep.sasha.stage15.task03.util.Convertor;
import by.itstep.sasha.stage15.task03.util.Initializer;
import by.itstep.sasha.stage15.task03.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage15.task03.util.Initializer.
        readIntWithValidation;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");
        int[][] matrix = Initializer.initMatrix(rows, columns);

        Printer.print(Convertor.convert(matrix));
        Printer.print("\n" + "Positive : "
                + MatrixLogic.countPositiveValuesAboveSecondDiagonal(matrix));
        Printer.print("\n" + "Negative : "
                + MatrixLogic.countNegativeValuesAboveSecondDiagonal(matrix));
    }
}

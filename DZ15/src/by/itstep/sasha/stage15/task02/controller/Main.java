package by.itstep.sasha.stage15.task02.controller;

import by.itstep.sasha.stage15.task02.model.MatrixManager;
import by.itstep.sasha.stage15.task02.util.Convertor;
import by.itstep.sasha.stage15.task02.util.Initializer;
import by.itstep.sasha.stage15.task02.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage15.task02.util.Initializer.
        readIntWithValidation;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");
        int[][] matrix = Initializer.consoleInit(rows, columns);

        Printer.print(Convertor.convertMatrix(matrix));
        Printer.print("Even: "
                + MatrixManager.countEvenValuesBelowFirstDiagonal(matrix));
        Printer.print("\n" + "Odd: "
                + MatrixManager.countOddValuesBelowFirstDiagonal(matrix));
    }
}

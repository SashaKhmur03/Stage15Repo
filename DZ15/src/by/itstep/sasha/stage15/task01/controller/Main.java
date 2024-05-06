package by.itstep.sasha.stage15.task01.controller;


import by.itstep.sasha.stage15.task01.util.Convertor;
import by.itstep.sasha.stage15.task01.util.Initializer;
import by.itstep.sasha.stage15.task01.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage15.task01.model.MatrixWorker.
        findMaxValueAboveDiagonal;
import static by.itstep.sasha.stage15.task01.model.MatrixWorker.
        findMinValueAboveDiagonal;
import static by.itstep.sasha.stage15.task01.util.Initializer.
        readIntWithValidation;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");
        int[][] matrix =  Initializer.initMatrix(rows, columns);

        Printer.print(Convertor.convert(matrix));
        Printer.print("Max: " + findMaxValueAboveDiagonal(matrix));
        Printer.print("Min: " + findMinValueAboveDiagonal(matrix));

    }
}


package ru.vsu.cs.maslovaei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double n = readNum();
        double summa = countSumma(n);

        writeNum(summa);

    }

    private static double readNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n;

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid value! Number must be positive. Try again.");
                return readNum();
            }

        } else {
            System.out.println("Invalid value! Number must be integer. Try again.");
            return readNum();
        }

        return n;
    }

    private static double countSumma(double n) {

        double summa = 0;
        for (double i = 1, j = n; i <= n && j >= 1; i++, j--) {
            summa += Math.pow(i, j);
        }
        return summa;
    }

    private static void writeNum(double summa) {
        System.out.println("Result: " + summa);
    }

}

package ru.vsu.cs.maslovaei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double n = readNumber("Input n: ");
        
        writeNumber(n);
    }
    
    private static double readNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static double countSumma(double n) {

        double summa = 0;
        for (double i = 1, j = n; i <= n && j >= 1; i++, j--) {
            summa += Math.pow(i, j);
        }
        return summa;
    }

    private static void writeNumber(double n) {
        System.out.println("Result: " + countSumma(n));
    }
    
}

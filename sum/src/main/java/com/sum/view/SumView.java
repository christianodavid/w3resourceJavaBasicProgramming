package com.sum.view;

import java.util.Scanner;

public class SumView {
    private final Scanner scanner;

    public SumView() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumberInput(String prompt) {
        System.out.print(prompt);
        while(!scanner.hasNextDouble()) {
            System.out.println("Coloque um número válido!");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public void displayResult(double num1, double num2, double result) {
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public void closeScanner() {
        scanner.close();
    }
}

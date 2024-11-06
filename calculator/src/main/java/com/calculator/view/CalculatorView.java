package com.calculator.view;

import java.util.Scanner;

public class CalculatorView {
    private final Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumberInput(String prompt) {
        System.out.print(prompt);
        while(!scanner.hasNextDouble()) {
            System.out.println("Insira um número válido!");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public void displayResult(double num1, double num2, double sumResult, double subtractResult, double multiplyResult, double divideResult, double moduleResult) {
        System.out.println(num1 + " + " + num2 + " = " + sumResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractResult);
        System.out.println(num1 + " * " + num2 + " = " + multiplyResult);
        System.out.println(num1 + " / " + num2 + " = " + divideResult);
        System.out.println(num1 + " % " + num2 + " = " + moduleResult);
    }

    public void showError(String message) {
        System.out.println(message);
    }

    public void closeScanner() {
        scanner.close();
    }
}

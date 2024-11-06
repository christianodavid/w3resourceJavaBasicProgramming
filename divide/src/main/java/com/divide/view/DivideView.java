package com.divide.view;

import java.util.Scanner;

public class DivideView {
    private final Scanner scanner;

    public DivideView() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumberInput(String prompt) {
        System.out.print(prompt);
        while(!scanner.hasNextDouble()) {
            System.out.println("Digite um número válido.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public void displayResult(double num1, double num2, double result) {
        System.out.println(num1 + " / " + num2 + " = " + result);
    }

    public void showError(String message){
        System.out.println(message);
    }

    public void closeScanner() {
        scanner.close();
    }
}

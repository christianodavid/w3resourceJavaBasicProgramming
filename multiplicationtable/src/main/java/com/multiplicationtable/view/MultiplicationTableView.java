package com.multiplicationtable.view;

import java.util.Scanner;

public class MultiplicationTableView {
    private final Scanner scanner;

    public MultiplicationTableView() {
        this.scanner = new Scanner(System.in);
    }

    public int getNumberInput(String prompt) {
        int number;
        do {
            System.out.print(prompt);
            while(!scanner.hasNextInt()) {
                System.out.println("Insira um número válido.");
                System.out.print(prompt);
                scanner.next();
            }
            number = scanner.nextInt();
            if(number < 1 || number > 10) {
                System.out.println("Por favor, insira um número entre 1 e 10.");
            }
        } while (number < 1 || number > 10);

        return number;
    }

    public void displayResult(int number) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}

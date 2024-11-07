package com.circleareaperimeter.view;

import java.util.Scanner;

public class CircleAreaPerimeterView {
    private final Scanner scanner;

    public CircleAreaPerimeterView() {
        this.scanner = new Scanner(System.in);
    }

    public double getRadiusInput(String prompt) {
        System.out.print(prompt);
        while(!scanner.hasNextDouble()) {
            System.out.println("Insira um número válido.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public void displayResult(double area, double perimeter) {
        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimeter);
    }

    public void closeScanner() {
        scanner.close();
    }
}

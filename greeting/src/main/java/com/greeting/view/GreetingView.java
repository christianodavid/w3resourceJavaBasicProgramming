package com.greeting.view;

import java.util.Scanner;

public class GreetingView {
    private final Scanner scanner;

    public GreetingView() {
        this.scanner = new Scanner(System.in);
    }

    public String getInputName() {
        System.out.print("Digite o teu nome: ");
        return scanner.nextLine();
    }

    public void displayGreeting(String message, String name) {
        System.out.println(message);
        System.out.println(name);
    }

    public void closeScanner() {
        scanner.close();
    }
}

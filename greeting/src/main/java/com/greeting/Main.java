package com.greeting;

import com.greeting.controller.GreetingController;
import com.greeting.model.GreetingModel;
import com.greeting.view.GreetingView;

public class Main {
    public static void main(String[] args) {
        GreetingModel greetingModel = new GreetingModel("Hello");
        GreetingView greetingView = new GreetingView();
        GreetingController greetingController = new GreetingController(greetingModel, greetingView);

        try {
            greetingController.processUserInput();
            greetingController.displayGreeting();
        } finally {
            greetingView.closeScanner();
        }
    }
}

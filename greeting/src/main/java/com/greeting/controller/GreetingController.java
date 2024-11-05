package com.greeting.controller;

import com.greeting.model.GreetingModel;
import com.greeting.view.GreetingView;

public class GreetingController {
    private final GreetingModel greetingModel;
    private final GreetingView greetingView;

    public GreetingController(GreetingModel greetingModel, GreetingView greetingView) {
        this.greetingModel = greetingModel;
        this.greetingView = greetingView;
    }


    public void processUserInput() {
        String name = greetingView.getInputName();
        greetingModel.setName(name);
    }

    public void displayGreeting() {
        greetingView.displayGreeting(greetingModel.getMessage(), greetingModel.getName());
    }
}

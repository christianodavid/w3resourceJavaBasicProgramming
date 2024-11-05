package com.greeting.model;

public class GreetingModel {
    private final String message;
    private String name;

    public GreetingModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

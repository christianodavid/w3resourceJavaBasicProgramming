package com.greeting.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingModelTest {
    @Test
    public void testGreetingModel() {
        GreetingModel greetingModel = new GreetingModel("Hello");
        greetingModel.setName("Christiano");
        assertEquals("Hello", greetingModel.getMessage());
        assertEquals("Christiano", greetingModel.getName());
    }

    @Test
    public void testSetName() {
        GreetingModel greetingModel = new GreetingModel("Hello");
        greetingModel.setName("Christiano");
        assertEquals("Christiano", greetingModel.getName());
    }
}

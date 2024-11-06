package com.divide.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideModelTest {
    private DivideModel divideModel;

    @BeforeEach
    void setUp() {
        divideModel = new DivideModel();
    }

    @ParameterizedTest
    @CsvSource({
            "6, 2, 3",
            "74.5, 5, 14.9",
            "10, 20, 0.5",
            "14, 8.75, 1.6"
    })
    public void testDivide(double num1, double num2, double expected) {
        divideModel.setNumbers(num1, num2);
        assertEquals(expected, divideModel.getResult());
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> divideModel.setNumbers(10, 0));
    }
}

package com.calculator.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorModelTest {
    private CalculatorModel calculatorModel;

    @BeforeEach
    void setUp() {
        calculatorModel = new CalculatorModel();
    }

    @ParameterizedTest
    @CsvSource({
            "10.0, 5.0, 15.0, 5.0, 50.0, 2.0, 0.0",
            "7.0, 3.0, 10.0, 4.0, 21.0, 2.3333333333333335, 1.0",
            "-8.0, 4.0, -4.0, -12.0, -32.0, -2.0, -0.0",
            "15.0, -3.0, 12.0, 18.0, -45.0, -5.0, 0.0",
            "0.0, 5.0, 5.0, -5.0, 0.0, 0.0, 0.0",
            "100.0, 20.0, 120.0, 80.0, 2000.0, 5.0, 0.0",
            "3.5, 1.5, 5.0, 2.0, 5.25, 2.3333333333333335, 0.5"
    })
    public void testCalculator(double num1, double num2, double expectedSum, double expectedSubtract, double expectedMultiply, double expectedDivide, double expectedModule) {
        calculatorModel.setNumbers(num1, num2);
        assertEquals(expectedSum, calculatorModel.getSumResult());
        assertEquals(expectedSubtract, calculatorModel.getSubtractResult());
        assertEquals(expectedMultiply, calculatorModel.getMultiplyResult());
        assertEquals(expectedDivide, calculatorModel.getDivideResult());
        assertEquals(expectedModule, calculatorModel.getModuleResult());
    }

    @Test
    public void testDivisionBy0() {
        assertThrows(ArithmeticException.class, () -> calculatorModel.setNumbers(7,0));
        assertThrows(ArithmeticException.class, () -> calculatorModel.setNumbers(10.678, 0));
    }
}

package com.sum.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumModelTest {
    private SumModel sumModel;

    @BeforeEach
    void setUp() {
        sumModel = new SumModel();
    }

    @ParameterizedTest
    @CsvSource({
            "74.5, 36.5, 111",
            "10, 20, 30",
            "0, 0, 0",
            "-5, 5, 0",
            "100.25, 200.52, 300.77"
    })
    public void testSum(double num1, double num2, double expected) {
        sumModel.setNumbers(num1, num2);
        assertEquals(expected, sumModel.getResult());
    }

    @ParameterizedTest
    @CsvSource({
            "74.5, 36.5",
            "10, 20",
            "0, 0",
            "-5, 5",
            "100.25, 200.52"
    })
    public void testGetters(double num1, double num2) {
        sumModel.setNumbers(num1, num2);
        assertEquals(num1, sumModel.getNum1());
        assertEquals(num2, sumModel.getNum2());
    }
}

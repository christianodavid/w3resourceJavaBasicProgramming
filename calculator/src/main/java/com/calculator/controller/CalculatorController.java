package com.calculator.controller;

import com.calculator.model.CalculatorModel;
import com.calculator.view.CalculatorView;

public class CalculatorController {
    private final CalculatorModel calculatorModel;
    private final CalculatorView calculatorView;

    public CalculatorController(CalculatorModel calculatorModel, CalculatorView calculatorView) {
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
    }

    public void calculator() {
        try {
            double num1 = calculatorView.getNumberInput("Digite o primeiro número: ");
            double num2 = calculatorView.getNumberInput("Digite o segundo número: ");

            calculatorModel.setNumbers(num1, num2);
            calculatorView.displayResult(calculatorModel.getNum1(), calculatorModel.getNum2(), calculatorModel.getSumResult(), calculatorModel.getSubtractResult(), calculatorModel.getMultiplyResult(),calculatorModel.getDivideResult(),calculatorModel.getModuleResult());
        } catch (Exception e) {
            calculatorView.showError(e.getMessage());
        }
    }
}

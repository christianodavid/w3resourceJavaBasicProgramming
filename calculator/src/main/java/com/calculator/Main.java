package com.calculator;

import com.calculator.controller.CalculatorController;
import com.calculator.model.CalculatorModel;
import com.calculator.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorView calculatorView = new CalculatorView();
        CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView);

        try {
            calculatorController.calculator();
        } finally {
            calculatorView.closeScanner();
        }
    }
}

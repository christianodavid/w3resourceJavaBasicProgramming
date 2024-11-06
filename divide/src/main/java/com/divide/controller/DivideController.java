package com.divide.controller;

import com.divide.model.DivideModel;
import com.divide.view.DivideView;

public class DivideController {
    private final DivideModel divideModel;
    private final DivideView divideView;

    public DivideController(DivideModel divideModel, DivideView divideView) {
        this.divideModel = divideModel;
        this.divideView = divideView;
    }

    public void processDivideInput() {
        try {
            double num1 = divideView.getNumberInput("Digite o primeiro número: ");
            double num2 = divideView.getNumberInput("Digite o segundo número: ");

            divideModel.setNumbers(num1, num2);
            divideView.displayResult(divideModel.getNum1(), divideModel.getNum2(),divideModel.getResult());
        } catch (Exception e) {
            divideView.showError(e.getMessage());
        }
    }
}

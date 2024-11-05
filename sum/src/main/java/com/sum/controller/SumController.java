package com.sum.controller;

import com.sum.model.SumModel;
import com.sum.view.SumView;

public class SumController {
    private final SumModel sumModel;
    private final SumView sumView;

    public SumController(SumModel sumModel, SumView sumView) {
        this.sumModel = sumModel;
        this.sumView = sumView;
    }

    public void processSumInput() {
        double num1 = sumView.getNumberInput("Digite o primeiro número: ");
        double num2 = sumView.getNumberInput("Digite o segundo número: ");

        sumModel.setNumbers(num1, num2);
        sumView.displayResult(sumModel.getNum1(), sumModel.getNum2(), sumModel.getResult());
    }
}

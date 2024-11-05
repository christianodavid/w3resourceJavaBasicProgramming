package com.sum;

import com.sum.controller.SumController;
import com.sum.model.SumModel;
import com.sum.view.SumView;

public class Main {
    public static void main(String[] args) {
        SumModel sumModel = new SumModel();
        SumView sumView = new SumView();
        SumController sumController = new SumController(sumModel, sumView);

        try {
            sumController.processSumInput();
        } finally {
            sumView.closeScanner();
        }
    }
}

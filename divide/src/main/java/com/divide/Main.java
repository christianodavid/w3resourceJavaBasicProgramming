package com.divide;

import com.divide.controller.DivideController;
import com.divide.model.DivideModel;
import com.divide.view.DivideView;

public class Main {
    public static void main(String[] args) {
        DivideModel divideModel = new DivideModel();
        DivideView divideView = new DivideView();
        DivideController divideController = new DivideController(divideModel, divideView);

        try {
            divideController.processDivideInput();
        } finally {
            divideView.closeScanner();
        }
    }
}

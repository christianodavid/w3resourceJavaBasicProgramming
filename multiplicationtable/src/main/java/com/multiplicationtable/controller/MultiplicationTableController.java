package com.multiplicationtable.controller;

import com.multiplicationtable.model.MultiplicationTableModel;
import com.multiplicationtable.view.MultiplicationTableView;

public class MultiplicationTableController {
    private final MultiplicationTableModel multiplicationTableModel;
    private final MultiplicationTableView multiplicationTableView;

    public MultiplicationTableController(MultiplicationTableModel multiplicationTableModel, MultiplicationTableView multiplicationTableView) {
        this.multiplicationTableModel = multiplicationTableModel;
        this.multiplicationTableView = multiplicationTableView;
    }

    public void multiplicationTable() {
        try {
            int number = multiplicationTableView.getNumberInput("Digite um número de 1 a 10 para gerar a tabuada: ");

            multiplicationTableModel.setNumber(number);
            multiplicationTableView.displayResult(multiplicationTableModel.getNumber());
        } finally {
            multiplicationTableView.closeScanner();
        }
    }
}

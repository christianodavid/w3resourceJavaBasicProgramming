package com.multiplicationtable;

import com.multiplicationtable.controller.MultiplicationTableController;
import com.multiplicationtable.model.MultiplicationTableModel;
import com.multiplicationtable.view.MultiplicationTableView;

public class Main {
    public static void main(String[] args) {
        MultiplicationTableModel multiplicationTableModel = new MultiplicationTableModel();
        MultiplicationTableView multiplicationTableView = new MultiplicationTableView();
        MultiplicationTableController multiplicationTableController = new MultiplicationTableController(multiplicationTableModel, multiplicationTableView);

        multiplicationTableController.multiplicationTable();
    }
}

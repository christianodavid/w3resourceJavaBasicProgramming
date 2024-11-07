package com.circleareaperimeter;

import com.circleareaperimeter.controller.CircleAreaPerimeterController;
import com.circleareaperimeter.model.CircleAreaPerimeterModel;
import com.circleareaperimeter.view.CircleAreaPerimeterView;

public class Main {
    public static void main(String[] args) {
        CircleAreaPerimeterModel circleAreaPerimeterModel = new CircleAreaPerimeterModel();
        CircleAreaPerimeterView circleAreaPerimeterView = new CircleAreaPerimeterView();
        CircleAreaPerimeterController circleAreaPerimeterController = new CircleAreaPerimeterController(circleAreaPerimeterModel, circleAreaPerimeterView);

        try {
            circleAreaPerimeterController.circleAreaPerimeter();
        } finally {
            circleAreaPerimeterView.closeScanner();
        }
    }
}

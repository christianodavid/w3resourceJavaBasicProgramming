package com.circleareaperimeter.controller;

import com.circleareaperimeter.model.CircleAreaPerimeterModel;
import com.circleareaperimeter.view.CircleAreaPerimeterView;

public class CircleAreaPerimeterController {
    private CircleAreaPerimeterModel circleAreaPerimeterModel;
    private CircleAreaPerimeterView circleAreaPerimeterView;

    public CircleAreaPerimeterController(CircleAreaPerimeterModel circleAreaPerimeterModel, CircleAreaPerimeterView circleAreaPerimeterView) {
        this.circleAreaPerimeterModel = circleAreaPerimeterModel;
        this.circleAreaPerimeterView = circleAreaPerimeterView;
    }

    public void circleAreaPerimeter() {
        double radius = circleAreaPerimeterView.getRadiusInput("Digite o raio do círculo: ");

        circleAreaPerimeterModel.setRadius(radius);
        circleAreaPerimeterView.displayResult(circleAreaPerimeterModel.getArea(), circleAreaPerimeterModel.getPerimeter());
    }
}

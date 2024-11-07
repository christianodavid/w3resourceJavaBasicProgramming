package com.circleareaperimeter.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAreaPerimeterModelTest {
    @ParameterizedTest
    @CsvSource({
            "1.0, 3.141592653589793, 6.283185307179586",
            "2.0, 12.566370614359172, 12.566370614359172",
            "0.5, 0.7853981633974483, 3.141592653589793",
            "3.0, 28.274333882308138, 18.84955592153876",
            "10.0, 314.1592653589793, 62.83185307179586",
            "0.0, 0.0, 0.0",
            "4.5, 63.61725123519331, 28.274333882308138"
    })
    public void testAreaPerimeterResult(double radius, double expectedArea, double expectedPerimeter) {
        CircleAreaPerimeterModel circleAreaPerimeterModel = new CircleAreaPerimeterModel();
        circleAreaPerimeterModel.setRadius(radius);
        assertEquals(expectedArea, circleAreaPerimeterModel.getArea());
        assertEquals(expectedPerimeter, circleAreaPerimeterModel.getPerimeter());
    }
}

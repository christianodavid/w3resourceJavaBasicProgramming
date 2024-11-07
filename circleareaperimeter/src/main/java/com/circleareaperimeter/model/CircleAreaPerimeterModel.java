package com.circleareaperimeter.model;

public class CircleAreaPerimeterModel {
    private double radius;
    private double area;
    private double perimeter;

    public void setRadius(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public void calculateArea() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

package com.divide.model;

public class DivideModel {
    private double num1;
    private double num2;
    private double result;

    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        divideNumbers();
    }

    private void divideNumbers() {
        if(this.num2 == 0) {
            throw new ArithmeticException("O número não pode ser dividido por 0.");
        }
        this.result = this.num1 / this.num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }
 }

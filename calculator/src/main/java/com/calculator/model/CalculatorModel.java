package com.calculator.model;

public class CalculatorModel {
    private double num1;
    private double num2;
    private double sumResult;
    private double subtractResult;
    private double multiplyResult;
    private double divideResult;
    private double moduleResult;

    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        calculateAddition();
        calculateSubtraction();
        calculateMultiplication();
        calculateDivision();
        calculateModule();
    }

    public void calculateAddition() {
        this.sumResult = this.num1 + this.num2;
    }

    public void calculateSubtraction() {
        this.subtractResult = this.num1 - this.num2;
    }

    public void calculateMultiplication() {
        this.multiplyResult = this.num1 * this.num2;
    }

    public void calculateDivision() {
        if(this.num2 == 0) {
            throw new ArithmeticException("O número não pode ser dividido por 0.");
        }
        this.divideResult = this.num1 / this.num2;
    }

    public void calculateModule() {
        if(this.num2 == 0) {
            throw new ArithmeticException("O número não pode ser dividido por 0.");
        }
        this.moduleResult = this.num1 % this.num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getSumResult() {
        return sumResult;
    }

    public double getSubtractResult() {
        return subtractResult;
    }

    public double getMultiplyResult() {
        return multiplyResult;
    }

    public double getDivideResult() {
        return divideResult;
    }

    public double getModuleResult() {
        return moduleResult;
    }
}

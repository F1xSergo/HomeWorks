package edu.academy.homework4.calculator;

public class CalculatorWithMath implements ICalculator{
    public double plus(double a, double b) {
        double c = a + b;
        return c;
    }

    public double minus(double a, double b) {
        double d = a - b;
        return d;
    }

    public double umno(double a, double b) {
        double e = a * b;
        return e;
    }

    public double del(double a, double b) {
        double f = a / b;
        return f;
    }
    public double power(double a, double b) {
        double g = Math.pow(a , b);
        return g;
    }
    public double ABS(double a) {
        double x = Math.abs(a);
        return x;
    }
    public double sqrt(double a) {
        double c = Math.sqrt(a);
        return c;
    }

}

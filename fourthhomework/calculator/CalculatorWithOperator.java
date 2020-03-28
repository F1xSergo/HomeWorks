package edu.academy.fourthhomework.calculator;
//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithOperator implements ICalculator {
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
        double g = 1;
        for (double i = 1; i <= b; i++) {    //формула возведения в степень
            g = g * a;
        }
        return g;
    }

    public double ABS(double a) {
        if (a < 0) {                //формула модуль из числа
            return -a;
        } else {
            return a;
        }
    }

//    public double sqrt(double a) {
//        double z;
//        double sr = a / 2;
//        do {
//            z = sr;                     //формул квадратный корень 1
//            sr = (z + (a / z)) / 2;
//        } while ((z - sr) != 0);
//        return sr;
//    }

    public double sqrt(double a) {
        double c = 1;
        for (; ; ) {                      //формул квадратный корень 2
            double ac = (c + a / c) / 2;
            if (ABS(c - ac) < 1e-10)
                break;
            c = ac;
        }
        return  c;
    }

}













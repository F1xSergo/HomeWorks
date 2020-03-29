package edu.academy.fourthhomework.calculator;

import edu.academy.secondhomework.CalculatorWithOperator;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator ca = new CalculatorWithOperator();
        double result = ca.plus(4.1,ca.umno(15,7)) + (ca.power(ca.del(28,5),2));
        System.out.println("Результат CalculatorWithOperator: ");
        System.out.println(result);
        System.out.printf("%.1f", result);
        System.out.println();
        System.out.printf("%.1f", result / 0.0d);//бесконечность
        System.out.println();
        System.out.printf("%.1f", result / 0);//бесконечность
        System.out.println();

        CalculatorWithMath cam = new CalculatorWithMath();
        double res = cam.plus(4.1,cam.umno(15,7)) + (cam.power(cam.del(28,5),2));
        System.out.println("Результат CalculatorWithMath: ");
        System.out.println(result);
        System.out.printf("%.1f", res);
        System.out.println();
        System.out.printf("%.1f", res / 0.0d);//бесконечность
        System.out.println();
        System.out.printf("%.1f", res / 0);//бесконечность
    }
}
//4.1 + 15 * 7 + (28 / 5) ^ 2
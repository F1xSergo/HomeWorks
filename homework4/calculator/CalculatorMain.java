package edu.academy.homework4.calculator;

import edu.academy.homework2.CalculatorWithOperator;

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
// with Math
        CalculatorWithMath cam = new CalculatorWithMath();
        double res = cam.plus(4.1,cam.umno(15,7)) + (cam.power(cam.del(28,5),2));
        System.out.println("Результат CalculatorWithMath: ");
        System.out.println(result);
        System.out.printf("%.1f", res);
        System.out.println();
        System.out.printf("%.1f", res / 0.0d);//бесконечность
        System.out.println();
        System.out.printf("%.1f", res / 0);//бесконечность
        System.out.println();

// with counter
        CalculatorWithCounter ccount = new CalculatorWithCounter(new CalculatorWithMath());
        double resc = ccount.plus(4.1,ccount.umno(15,7)) + (ccount.power(cam.del(28,5),2));
        System.out.println("Результат CalculatorWithCount: ");
        System.out.println(resc);
        System.out.printf("%.1f", resc);
        System.out.println();
        System.out.println(ccount.getCount());

    }
}
//4.1 + 15 * 7 + (28 / 5) ^ 2
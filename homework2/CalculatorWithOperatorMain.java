package edu.academy.homework2;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator ca = new CalculatorWithOperator();


        double result = ca.plus(4.1,ca.umno(15,7)) + (ca.power(ca.del(28,5),2));

        System.out.println(result);

        System.out.printf("%.1f", result);
    }
}
//4.1 + 15 * 7 + (28 / 5) ^ 2
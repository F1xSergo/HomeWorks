package edu.academy.thirdhomework;

import java.math.BigInteger;

public class Cycles {
    //2.1
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "   ");
            }
            System.out.println("");
        }
    }
// факториал
    public int fact (int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
//это способ чтоб вывести все число полностью
    public BigInteger fact1 (int a) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public int multidigital(int a) {
        //способ с нета
        //return String.valueOf(a).chars().map(Character::getNumericValue).reduce((b,c) -> b * c ).orElse(0);

        //мой
        int mult = 1;
            for(mult = 1;a >= 1; a /= 10) {
                mult *= a % 10;
                System.out.println( a  +  " -  результат умножения 2x последних цифры чисел = " + mult);
            }
            return mult;
        }
    }


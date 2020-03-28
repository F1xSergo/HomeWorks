package edu.academy.fourthhomework;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = new String();
        String n1 = new String();
        System.out.println("Введите страну");
        n = s.nextLine();
        System.out.println((ECountry.valueOf(n)));

        System.out.println("Введите страну для сравнения");
        n1 = s.nextLine();
        System.out.println((ECountry.valueOf(n)));

        System.out.println("Результат сравнения: " + (ECountry.valueOf(n) == ECountry.valueOf(n1)));

        System.out.println("Другой способ сравнения " + (ECountry.valueOf(n) == ECountry.FRANCE));



//        Info info = ECountry.valueOf(n);
//        Info info2 = ECountry.valueOf(n);



//        System.out.println(info);
//        System.out.println(info2);
//        System.out.println(info == info2);
//        System.out.println(info == ECountry.BELARUS);
    }
}

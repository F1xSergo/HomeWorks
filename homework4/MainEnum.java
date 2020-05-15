package edu.academy.homework4;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
//1 - 1/8
        System.out.println(ECountry.RUSSIA.compareTo(ECountry.BELARUS));// rus находится на одну позицию правее
        Scanner s = new Scanner(System.in);
        String n = new String();
        String n1 = new String();
        System.out.println("Введите страну");
        n = s.nextLine();
        System.out.println((ECountry.valueOFIgnoreCase(n)));

        System.out.println("Введите страну для сравнения");
        n1 = s.nextLine();
        System.out.println((ECountry.valueOFIgnoreCase(n1)));

        System.out.println("Результат сравнения: " + (ECountry.valueOFIgnoreCase(n) == ECountry.valueOFIgnoreCase(n1)));

        System.out.println("Другой способ сравнения: " + (ECountry.valueOFIgnoreCase(n) == ECountry.FRANCE) + "(см 22 строку)");
        //System.out.println(ECountry.valueOFIgnoreCase("BEBR"));// examptio
// 1.9
        CountryAreaComparator cac = new CountryAreaComparator();
        System.out.println("Введите 2 страны для сравнения ");
        n = s.nextLine();
        n1 = s.nextLine();
        System.out.println("Результат сравнения: " + cac.compare(ECountry.valueOFIgnoreCase(n),ECountry.valueOFIgnoreCase(n1)));


//        Info info = ECountry.valueOfIgnoreCase("BELARUS");
//        Info info2 = ECountry.valueOfIgnoreCase("ITALY");
//        System.out.println(info);
//        System.out.println(info2);
//        System.out.println(info == info2);
//        System.out.println(info == ECountry.BELARUS);
    }
}

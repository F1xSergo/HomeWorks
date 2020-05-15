package edu.academy.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер цвета");
        int number = in.nextInt();

        Color color  = new Color(number);// это строка запорола все , так как стояла до сканера

        System.out.println(color.getName());


    }
}

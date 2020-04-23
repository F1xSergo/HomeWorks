package edu.academy.sevenhomework;

import java.util.Scanner;

public class ExceptionMain2 {
    public static void main(String[] args) {
        int count = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Пожауйста, введите число от 1 до 10. У вас " + count + " попытки");
        count--;
        while (true) {
            try {
               int x = Integer.parseInt(scanner.nextLine());
                if (x >= 1 && x <= 10) {
                    System.out.println(" Вы ввели правильное число: " + x);
                    count--;
                    return;
                }else if (count == 0) {
                      System.out.println("Попыток больше нет");
                      return;
                } else {
                    System.out.println(" Введите число от 1 до 10. У вас попыток: " + count);
                    count--;
                }
            } catch (Exception e) {
                if (count == 0) {
                    System.out.println("Попыток больше нет");
                   return;
                } else {
                    System.out.println(" Вы ввели текст. У вас попыток: " + count);
                    count--;
                }
            }
        }
    }
}












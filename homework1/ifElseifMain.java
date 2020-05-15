package edu.academy.homework1;

import java.util.Objects;
import java.util.Scanner;

public class ifElseifMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Назовите ваше имя");

        String name = in.nextLine();

        if (Objects.equals("Вася", name)) {
            System.out.println("Привет! \nЯ тебя так долго ждал!");
        } else if (Objects.equals("Анастасия", name)) {
            System.out.println("Я тебя так долго ждал!");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

package edu.academy.homework3;

import java.util.Scanner;

public class ArraysWhileDo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[5];

        System.out.println("Введите элементы");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();

        }
        int wd = 0;
        System.out.println("массив состоит из : ");
        do {
            System.out.print(ar[wd] + " ");
            wd++;
        } while (wd != ar.length);
    }
}




package edu.academy.thirdhomework;

import java.util.Scanner;

public class ArraysWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[5];

        System.out.println("Введите элементы");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();

        }
        int wd = 0;
        System.out.println("массив состоит из : ");
        while (wd != ar.length ) {
            System.out.print(ar[wd] + " ");
            wd++;
        }
    }
}


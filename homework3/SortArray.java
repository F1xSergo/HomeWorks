package edu.academy.homework3;

import java.util.Arrays;
import java.util.Scanner;
//пузырьковая сортировка
//{0,1,2,3,4,5,6,7,8,9};{0,1,2,3,4,5,6,7,8,0}, {0,1,2,3,5,5,5,7,8,0} {1,1,1,1,1,1,1,1,1,0};
public class SortArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] mas = new int[10];
        System.out.println("Введите элементы");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println("пузырьковая сортировка выполнена" + Arrays.toString(mas));
    }
}
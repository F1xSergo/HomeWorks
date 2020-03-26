package edu.academy.thirdhomework;

import java.util.Arrays;
import java.util.Scanner;
//Удалить дубликаты
public class SortArrayDeleteDublikat {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.println("Введите элементы");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }
        System.out.print("массив " + Arrays.toString(mas));
        System.out.println();
//Сортировка выбором
        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int min_i = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = mas[i];
                mas[i] = mas[min_i];
                mas[min_i] = tmp;
            }
        }
        System.out.println("Сортировка выбором  выполнена" + Arrays.toString(mas));
        System.out.println();
//Удаление дубликатов
        int n = mas.length;
        for ( int i = 0, m = 0; i != n; i++, n = m ) {
            for ( int j = m = i + 1; j != n; j++ ) {
                if ( mas[j] != mas[i] ) {
                    if ( m != j ) mas[m] = mas[j];
                    m++;
                }
            }
        }
        if ( n != mas.length ) {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = mas[i];

            mas = b;
        }
//        for ( int x : mas )
        System.out.println("Удаление дубликатов в массиве выполнено " + Arrays.toString(mas));
    }
}

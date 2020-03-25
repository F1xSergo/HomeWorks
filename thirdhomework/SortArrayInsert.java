package edu.academy.thirdhomework;

import java.util.Arrays;
import java.util.Scanner;
//сортировка вставками
//{0,1,2,3,4,5,6,7,8,9};{0,1,2,3,4,5,6,7,8,0}, {0,1,2,3,5,5,5,7,8,0} {1,1,1,1,1,1,1,1,1,0};
public class SortArrayInsert {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.println("Введите элементы");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }
        System.out.print("массив " + Arrays.toString(mas));

        for (int left = 0; left < mas.length; left++) {
            // Вытаскиваем значение элемента
            int value = mas[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < mas[i]) {
                    mas[i + 1] = mas[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            mas[i + 1] = value;
        }
        System.out.println();
        System.out.println("сортировка вставками выполнена " + Arrays.toString(mas));
    }
}

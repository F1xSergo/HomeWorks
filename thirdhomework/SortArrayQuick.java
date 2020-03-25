package edu.academy.thirdhomework;

import java.util.Arrays;
import java.util.Scanner;
//Сортировка с помощью разделения
//{0,1,2,3,4,5,6,7,8,9};{0,1,2,3,4,5,6,7,8,0}, {0,1,2,3,5,5,5,7,8,0} {1,1,1,1,1,1,1,1,1,0};
public class SortArrayQuick {
    public static void quickSort(int[] mas, int low, int high) {
        if (mas.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = mas[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (mas[i] < opora) {
                i++;
            }

            while (mas[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(mas, low, j);

        if (high > i)
            quickSort(mas, i, high);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.println("Введите элементы");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }
        System.out.print("массив " + Arrays.toString(mas));
        int low = 0;
        int high = mas.length - 1;
        quickSort(mas, low, high);
            System.out.println();
            System.out.println("быстрая сортировка выполнена " + Arrays.toString(mas));
        }
    }


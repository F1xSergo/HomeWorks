package edu.academy.thirdhomework;


import java.util.Arrays;
import java.util.Scanner;

//{0,1,2,3,4,5,6,7,8,9};{0,1,2,3,4,5,6,7,8,0}, {0,1,2,3,5,5,5,7,8,0} {1,1,1,1,1,1,1,1,1,0};
// сортировка слиянием
public class SortArrayMerge {
    public static void mergeSort(int[] mas, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(mas, lo, mid);
        mergeSort(mas, mid + 1, hi);

        int[] buf = Arrays.copyOf(mas, mas.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = mas[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                mas[k] = buf[j];
                j++;
            } else if (j > hi) {
                mas[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                mas[k] = buf[j];
                j++;
            } else {
                mas[k] = buf[i];
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.println("Введите элементы");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }



        System.out.println();
        System.out.print("сортировка слиянием  выполнена " + Arrays.toString(mas));
    }
}



package edu.academy.thirdhomework;


import java.util.Arrays;
import java.util.Scanner;

//{0,1,2,3,4,5,6,7,8,9};{0,1,2,3,4,5,6,7,8,0}, {0,1,2,3,5,5,5,7,8,0} {1,1,1,1,1,1,1,1,1,0};
// сортировка слиянием
public class SortArrayMerge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.println("Введите элементы");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }
        int[] result = mergesort(mas);
        //
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] mas) {
        int[] mas1 = Arrays.copyOf(mas, mas.length);
        int[] mas2 = new int[mas.length];
        int[] result = mergesortInner(mas, mas2, 0, mas.length);
        return result;
    }

    /**
     *
     * @param mas1 Массив для сортировки.
     * @param mas2 Буфер. Размер должен быть равен размеру buffer1.
     * @param startIndex Начальный индекс в buffer1 для сортировки.
     * @param endIndex Конечный индекс в buffer1 для сортировки.
     * @return
     */

    public static int[] mergesortInner(int[] mas1, int[] mas2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return mas1;
        }
        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(mas1, mas2, startIndex, middle);
        int[] sorted2 = mergesortInner(mas1, mas2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == mas1 ? mas2 : mas1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}







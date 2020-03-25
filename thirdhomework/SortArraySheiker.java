package edu.academy.thirdhomework;

import java.util.Arrays;
import java.util.Scanner;
//шейкерная сортировка
//{0,1,2,3,4,5,6,7,8,9};{0,1,2,3,4,5,6,7,8,0}, {0,1,2,3,5,5,5,7,8,0} {1,1,1,1,1,1,1,1,1,0};
public class SortArraySheiker {
 public static void main(String[] args) {
    int temp;
    Scanner s = new Scanner(System.in);

    int [] mas = new int[10];
    System.out.println("Введите элементы");
    for (int i = 0; i < mas.length; i++) {
        mas[i] = s.nextInt();
    }
    int leftSide = 0;
    int rightSide = mas.length - 1;

    do {

        for (int i = leftSide; i < rightSide; i++) { // Сортир. влево ищем МАКС. знач.


            if (mas[i] > mas[i + 1]) {
                temp = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = temp;
            }
        }
        rightSide--; // Уменьшаем количество проходов
        for (int i = rightSide; i > leftSide; i--) { // Теперь идём в обратную сторону ищем МИН.
            if (mas[i] < mas[i - 1]) {
                temp = mas[i];
                mas[i] = mas[i - 1];
                mas[i - 1] = temp;
            }
        }
        leftSide++; // Уменьшаем количество проходов т.к. мы шли с конца исходя из условия
        // последнего for, что бы уменьшить кол-во проходокб нужно инкрементировать счётчик
    } while (leftSide < rightSide); // Априори наше условие при котором буду происходить
    // проходки

        System.out.print("шейкерная сортировка выполнена " + Arrays.toString(mas));
    }
}




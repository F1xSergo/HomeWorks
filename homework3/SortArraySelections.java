package edu.academy.homework3;

import java.util.Arrays;
import java.util.Scanner;
//Сортировка выбором
//{0,1,2,3,4,5,6,7,8,9};{0,1,2,3,4,5,6,7,8,0}, {0,1,2,3,5,5,5,7,8,0} {1,1,1,1,1,1,1,1,1,0};
public class SortArraySelections {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.println("Введите элементы");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }
        System.out.print("массив " + Arrays.toString(mas));

      /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < mas.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = mas[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < mas.length; j++) {
                //Если находим, запоминаем его индекс
                if (mas[j] < min) {
                    min = mas[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = mas[i];
                mas[i] = mas[min_i];
                mas[min_i] = tmp;
            }
        }
        System.out.println();
        System.out.println("Сортировка выбором  выполнена" + Arrays.toString(mas));
    }
}


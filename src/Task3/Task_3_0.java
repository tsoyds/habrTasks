package Task3;

import java.util.Arrays;
import java.util.Timer;
// реализовать позже

/*
Двоичный поиск
Задача:
Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
Используйте перебор и двоичный поиск для решения этой задачи.
Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
 */
public class Task_3_0 {

    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i=0; i<array.length; i++){
             array[i] = (int)(Math.random()*100);
        }
        int number = 75;

        int k = entranceToArray(number,array);
        System.out.println(k);
        int r = entranceToArrayBinarySearch(number, array);
        System.out.println(r);
    }

    public static int entranceToArray(int number, int[] array){
        boolean condition = false;
        for (int i = 0; i<array.length; i++){
            if (number==array[i]) return i;
        }

        return -1;
    }

    public static int entranceToArrayBinarySearch (int number, int[] array){
        return Arrays.binarySearch(array, number);
    }
}


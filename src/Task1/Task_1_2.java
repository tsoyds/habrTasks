package Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Поиск простых чисел

Задача:

Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */
public class Task_1_2 {
    public static void main(String[] args) {
        int[] array = new int[101];
        for (int i=0; i<array.length; i++)
        {
            array[i]=i;
        }
        System.out.println(Arrays.toString(array));

        for (int i=2; i<array.length; i++){
            int counter=0;
            //i=5 -> array[5] = 7 ->
            for (int j=2; j<array[i];j++){
                //System.out.println(array[i]%j==0);
               // System.out.println(i+" "+j);
                if(array[i]%j==0){
                    counter++;
                }

            }
            if (counter==0){
                System.out.print(array[i]);
                System.out.print(" ");
            }

        }
    }
}

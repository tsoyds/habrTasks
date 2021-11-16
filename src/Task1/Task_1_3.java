package Task1;

import java.util.Arrays;

/*
Удаление из массива

Задача:

Дан массив целых чисел и ещё одно целое число.
Удалите все вхождения этого числа из массива (пропусков быть не должно).
 */
public class Task_1_3 {
    public static void main(String[] args) {
        int number = 7;
        int[] numbers = new int[50];
        for (int i=0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(removeNumber(numbers, number)));

    }

    public static int[] removeNumber(int[] numbers, int number){
        int k=0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==number){
                k++;
            }
        }
        int[] numbersAfterRemove = new int[numbers.length-k];
        int l=0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]!=number){
                numbersAfterRemove[l] = numbers[i];
                l++;
            }
        }

        return numbersAfterRemove;
    }
}

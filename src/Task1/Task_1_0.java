package Task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Максимальное, минимальное и среднее значение
Задача:
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(),
который возвращает значение в промежутке [0, 1].
 */
public class Task_1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your number");
        int n = scanner.nextInt(); // Ввод числа n с консоли - размер массива
        double[] massive = new double[n];

        for (int i=0; i<massive.length; i++){
            massive[i] = Math.random();
        }

        System.out.println(Arrays.toString(massive)); //Вывод массива
        Arrays.sort(massive);

        System.out.println("MAX_VALUE= " + massive[0]+ " MIN_VALUE= " + massive[n-1]);

        System.out.println("MID_VALUE= "+ massive[n/2]);
        scanner.close();
    }
}

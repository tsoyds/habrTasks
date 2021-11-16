package Task1;

import java.util.Arrays;

/*
Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */
public class Task_1_1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i=0; i<10; i++){
            mass[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(mass));
        bubble(mass);
        System.out.println(Arrays.toString(mass));
    }
    public static void bubble(int[] mass){
       for (int i=0; i<mass.length; i++){
           for(int j=1; j<mass.length-i; j++){
               int k=mass[j-1];
               if (mass[j-1]>mass[j]){
                   mass[j-1] = mass[j];
                   mass[j] = k;
               }
           }
       }
    }
}


package Task2;

import java.util.Random;

/*
Генерация случайного элемента с весом

Задача:

Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом,
с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже,
чем значение «3».
 */
public class Task_2_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{8,5,1,7,8};
        RandomFromTwoArrays test = new RandomFromTwoArrays(array1, array2);
        test.returnNumber(test);

    }
}

class RandomFromTwoArrays {
    int[] values;
    int[] weights;

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public int[] getWeights() {
        return weights;
    }

    public void setWeights(int[] weights) {
        this.weights = weights;
    }

    public RandomFromTwoArrays (int[] number, int[] weight) {
        this.values = number;
        this.weights = weight;
        if (number.length != weight.length){
            System.out.println("Incorrect massive");
        }

        this.ranges = new int[values.length];
        this.sumLength=0;

        for (int i=0; i<values.length;i++){
            sumLength+=weight[i];
        }
    }

    private int[] ranges; //представим, что веса это отрезки, ranges - массива начал отрезков
    private int sumLength; // общая длина всех отрезков;

    public int returnNumber (RandomFromTwoArrays randomFromTwoArrays){
        int num=0;
        int randomNumber = (int) (Math.random()*(sumLength-1));
        for (int i=0; i<ranges.length; i++){
            num+=weights[i];
            ranges[i]=num; // подставляем в массив начало координат нашего отрезка в массиве
            System.out.println(ranges[i]);
        }

        for (int i=0; i<ranges.length; i++){ //цикл проверки в какой промежуток попадает наше рандомное число
            if (i==(ranges.length-1)){
                num=i; break;
            }
            if (randomNumber<=ranges[i]&&randomNumber>values[i+1]) {
                num=i;
                break;
            }
        }
        System.out.println("random number in length "+randomNumber);
        System.out.println("value in array "+num);
        return values[num];

    }

}


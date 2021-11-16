package Task2;
/*
Проектирование и создание класса, описывающего вектор

Задача:
Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
конструктор с параметрами в виде списка координат x, y, z
метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
$\sqrt{x^2 + y^2 + z^2}$
метод, вычисляющий скалярное произведение:
$x_1x_2 + y_1y_2 + z_1z_2$
метод, вычисляющий векторное произведение с другим вектором:
$(y_1z_2 - z_1y_2, z_1x_2 - x_1z_2, x_1y_2 - y_1x_2)$
метод, вычисляющий угол между векторами (или косинус угла): косинус угла
между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
$\frac{(a,b)}{|a| \cdot |b|}$
методы для суммы и разности:
$(x_1 + x_2, y_1 + y_2, z_1 + z_2)$
$(x_1 - x_2, y_1 - y_2, z_1 - z_2)$
статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый.
То есть, нужно реализовать шаблон "Неизменяемый объект"
 */

import java.util.Arrays;

public class Task_2_0 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(3,5,4);
        Vector vector2 = new Vector(6,4,2.4);
        System.out.println(vector1.vectorLength());
        System.out.println(vector2.vectorLength());
        vector1.angle(vector2);
        vector1.scalarMultiplication(vector2);
        vector1.diff(vector2);
        //vector1.vectorMultiplication(vector2);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println(Arrays.toString(Vector.randomVectors(7)));
    }
}

class Vector {
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double vectorLength() { // длина вектора, применение класса Math
        double length;
        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return length;
    }

    public double scalarMultiplication(Vector vector) { // Скалярное произведение
        double mult;
        mult = x * vector.x + y * vector.y + z * vector.z;
        return mult;
    }

    public Vector vectorMultiplication(Vector vector) { // Векторное произведение
        return new Vector(
                x = y * vector.z - z * vector.y,
                y = z * vector.x - x * vector.z,
                z = x * vector.y - y * vector.x
        );
    }

    public double angle (Vector vector) { // вычисление угла
        double angle = scalarMultiplication(vector) / (vector.vectorLength() * vectorLength());
        return angle;
    }

    public Vector sum (Vector vector) { // сумма векторов
        return new Vector(
                x+vector.x,
                y+vector.y,
                z+vector.z
        );
    }

    public Vector diff (Vector vector){ // разность векторов
        return new Vector(
                x-vector.x,
                y-vector.y,
                z-vector.z
        );
    }

    public static Vector[] randomVectors(int N){ // генерация массива N случайных векторов
        Vector[] vectors = new Vector[N];
        for (int i=0; i<vectors.length; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }



}

package Task3;
/*
Найти корень уравнения
Задача:
Найдите корень уравнения
$cos(x^5) + x^4 - 345.3 * x - 23 = 0$
на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
Используйте для этого метод деления отрезка пополам (и рекурсию).
 */
public class Task_3_1 {
    public static void main(String[] args) {
        System.out.println(findX(0,10,0.001));
    }
//[0..10], отрезок 0_______10 точность 0.001
    public static double findX (double a, double b, double acc) {
        double c, z;
        if (Math.abs(equalsToZero(a)) <= acc) return a;
        if (Math.abs(equalsToZero(b)) <= acc) return b;
        if ((b-a)<=acc) return a;
            c=a+(b-a)/2;
            //if (Math.abs(equalsToZero(c)) <= acc) return c;
            if (Math.signum(equalsToZero(a)) != Math.signum(equalsToZero(c))) {
                b = c;
                return findX(a, c, acc);
            }
            else {
                a = c;
                return findX(c, b, acc);
            }
            //return findX(a, b, acc);


    }

    public static double equalsToZero (double x){
        double z = Math.cos(Math.pow(x,5))+Math.pow(x,4)-345.3*x-23;
        //System.out.println(z);
        return z;
    }
}




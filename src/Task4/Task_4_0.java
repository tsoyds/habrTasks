package Task4;
//Реализовать иерархию классов, описывающую трёхмерные фигуры
//Класс Box является контейнером, он можем содержать в себе другие фигуры.
//Метод add() принимает на вход Shape. Нужно добавлять новые фигуры до тех пор,
//Пока для них хватаем места в Box (будем считать только объём, игнорируя форму.
//Допустим, мы переливаем жидкость).
//Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
public class Task_4_0 {
    public static void main(String[] args) {
        Box box = new Box(1000);
        Cylinder cylinder = new Cylinder(5,7);
        Ball ball = new Ball(6);
        Pyramid pyramid1 = new Pyramid(5,5);
        Pyramid pyramid2 = new Pyramid(7,12);

        System.out.println(cylinder.getVolume());
        System.out.println(ball.getVolume());
        System.out.println(pyramid1.getVolume());
        System.out.println(pyramid2.getVolume());

        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
        System.out.println(box.add(pyramid1));
        System.out.println(box.add(pyramid2));
    }
}

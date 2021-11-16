package Task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
Связный список
Еще одна задача, которую я часто даю — реализация связного списка.
Её можно давать в самом простом виде (реализовать только add() и get()),
а можно попросить реализовать java.util.List.
Я не буду подробно на этом останавливаться,
много статей о реализации связного списка на Java есть на Хабре,
к примеру эта: https://habr.com/ru/post/127864/
 */
public class Task_2_2 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 17);
        Human human2 = new Human("Tom", 16);
        List<Human> humans  = new ArrayList<Human>();
        humans.add(human1);
        humans.add(human2);

        System.out.println(humans.get(1));
        System.out.println(humans.get(0));
        System.out.println(humans  );
        humans.remove(1);
        System.out.println(humans);

    }

}

class Human {
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Hello from constructor Human");
    }


}
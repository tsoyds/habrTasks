package Task6;
/*
Конвертер температур
Задача:
Напишите класс BaseConverter для конвертации из градусов по Цельсию в
Кельвины​, ​Фаренгейты​, и так далее. У метода должен быть метод convert, который
и делает конвертацию.
 */
public class Task_6_0 {
    public static void main(String[] args) {
        double temperatureInLivingRoom = 23.5;
        System.out.println("t = " + new converterToFarenheit().convert(temperatureInLivingRoom));
        System.out.println("t = " + new converterToKelvin().convert(temperatureInLivingRoom));
    }
}

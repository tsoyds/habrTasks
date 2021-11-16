package Task4;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape{
    private double radius;

    public SolidOfRevolution(double volume) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Box extends Shape {
    private double boxVolume=0;
    List<Shape> shapes = new ArrayList<>();
    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape){
        if (getVolume() > boxVolume){
            boxVolume+=shape.getVolume();
            shapes.add(shape);
            return true;
        }
        else return false;
    }
}

class Pyramid extends Shape{
    private double s, h;
    public Pyramid(double s, double h) {
        super(s*h/3);
    }
}

class Cylinder extends SolidOfRevolution{
    private double height;
    public Cylinder(double radius, double height) {
        super(Math.PI*height*Math.pow(radius,2));
    }
}

class Ball extends SolidOfRevolution{
    public Ball (double radius){
        super(4/3*Math.PI*Math.pow(radius,3));
    }
}

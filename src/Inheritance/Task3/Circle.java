package Inheritance.Task3;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

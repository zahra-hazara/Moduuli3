package Inheritance.Task4;

public class Circle extends Shape1 {
    private double radius;

    public Circle(double radius, String color) {
        super(color); // Call the parent constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius %.1f and color %s", radius, getColor());
    }
}

package Inheritance.Task4;

public class Rectangle extends Shape1 {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color); // Call the parent constructor
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width %.1f and height %.1f and color %s", width, height, getColor());
    }
}

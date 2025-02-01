package Inheritance.Task4;

public class Triangle extends Shape1 {
    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        super(color); // Call the parent constructor
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return String.format("Triangle with base %.1f and height %.1f and color %s", base, height, getColor());
    }
}

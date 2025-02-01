package Inheritance.Task3;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Getter
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
}
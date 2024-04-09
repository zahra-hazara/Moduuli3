package Inheritance.Task4;

public class Triangle1 extends Shape1 {
    private double base;
    private double height;

    public Triangle1(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "Triangle - " + super.toString();
    }
}

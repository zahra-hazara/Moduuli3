package Inheritance.Task4;

public class Circle1 extends Shape1 {
    private double radius;
    public Circle1(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        return "Circle - " + super.toString();
    }


}

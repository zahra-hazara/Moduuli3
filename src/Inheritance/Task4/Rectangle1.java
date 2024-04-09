package Inheritance.Task4;


public class Rectangle1 extends Shape1 {
    private double width;
    private double height;


    public Rectangle1(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public String toString() {
        return "Rectangle - " + super.toString();
    }
}

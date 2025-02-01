package Inheritance.Task4;
public class Shape1 {
    private String color;

    public Shape1(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0; // Default implementation
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape of color " + color;
    }
}


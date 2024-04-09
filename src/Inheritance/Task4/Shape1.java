package Inheritance.Task4;

public class Shape1 {
    private String color;
    public double calculateArea() {
        return 0;
    }
    public Shape1(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString() + " (Color: " + color + ")";
    }
}

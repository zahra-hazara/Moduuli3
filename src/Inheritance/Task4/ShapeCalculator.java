package Inheritance.Task4;

public class ShapeCalculator {
    public static void main(String[] args) {
        // Create an array of Shape objects with colors
        Shape1[] shapes = new Shape1[]{
                new Circle(5.0, "Red"),
                new Rectangle(4.0, 6.0, "Blue"),
                new Triangle(3.0, 8.0, "Green")
        };

        System.out.println("Shape Calculator\n");

        // Loop through the array and display the area of each shape
        for (Shape1 shape : shapes) {
            System.out.printf("%s: Area = %.2f\n", shape, shape.calculateArea());
        }
    }
}

package Inheritance.Task4;

public class ShapeCalculator1 {
    public static void main(String[] args) {
        //Shape objects creation
        Shape1[] shapes = new Shape1[]{
                new Circle1(5.0, "Red"),
                new Rectangle1(4.0, 6.0, "Blue"),
                new Triangle1(3.0, 8.0, "Green")
        };
        //Printing header
        System.out.println("Shape Calculator\n");

        //Iterating over all shapes and printing their areas and colors
        for (Shape1 shape : shapes) {
            // Checking the type of shape and printing its area and color
            if (shape instanceof Circle1) {
                Circle1 circle1 = (Circle1) shape;
                System.out.printf("Area of Circle with radius %.1f: %.18f, Color: %s\n", circle1.getRadius(), circle1.calculateArea(), circle1.getColor());
            } else if (shape instanceof Rectangle1) {
                Rectangle1 rectangle1 = (Rectangle1) shape;
                System.out.printf("Area of Rectangle with width %.1f and height %.1f: %.1f, Color: %s\n", rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.calculateArea(), rectangle1.getColor());
            } else if (shape instanceof Triangle1) {
                Triangle1 triangle1 = (Triangle1) shape;
                System.out.printf("Area of Triangle with base %.1f and height %.1f: %.1f, Color: %s\n", triangle1.getBase(), triangle1.getHeight(), triangle1.calculateArea(), triangle1.getColor());
            }
        }
    }
}

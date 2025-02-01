package Inheritance.Task3;

public class ShapeCalculator {
    public static void main(String[] args) {
        //Shape-olioiden taulukon luominen
        Shape[] shapes = new Shape[]{
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 8.0)
        };
        //Tulostetaan otsikko
        System.out.println("Shape Calculator\n");

        //Käydään läpi kaikki muodot ja tulostetaan niiden pinta-alat
        for (Shape shape : shapes) {
            //  Tarkistetaan muodon tyyppi ja tulostetaan sen pinta-ala
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.printf("Area of Circle with radius %.1f: %.18f\n", circle.getRadius(), circle.calculateArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.printf("Area of Rectangle with width %.1f and height %.1f: %.1f\n", rectangle.getWidth(), rectangle.getHeight(), rectangle.calculateArea());
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.printf("Area of Triangle with base %.1f and height %.1f: %.1f\n", triangle.getBase(), triangle.getHeight(), triangle.calculateArea());
            }
        }
    }
}
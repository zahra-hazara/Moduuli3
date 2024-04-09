package Inheritance.Task2;
public class Car {
    String make;
    String model;
    int year;
    int speed;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public void accelerate(int acceleration) {
        speed += acceleration;
    }

    public void decelerate(int deceleration) {
        if (speed - deceleration >= 0) {
            speed -= deceleration;
        } else {
            speed = 0;
        }
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " with current speed " + speed + " mph";
    }
}


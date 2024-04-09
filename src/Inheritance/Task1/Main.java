package Inheritance.Task1;

public class Main {
    public static void main(String[] args) {
        Car regularCar = new Car("Toyota", "Camry", 2020);
        System.out.println(regularCar);

        SportsCar sportsCar = new SportsCar("Ferrari", "458 Italia", 2022);
        System.out.println(sportsCar);

        sportsCar.accelerate(sportsCar.acceleration);
        System.out.println("After accelerating: " + sportsCar);

        sportsCar.decelerate(sportsCar.deceleration);
        System.out.println("After decelerating: " + sportsCar);
    }
}

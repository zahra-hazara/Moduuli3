package Inheritance.Task2;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Mercedes", "Sprinter", 2020);
        System.out.println(bus);

        bus.accelerate(30);
        System.out.println(bus);

        bus.passengerEnter(10);
        System.out.println(bus);

        bus.decelerate(20);
        System.out.println(bus);

        bus.passengerExit(5);
        System.out.println(bus);
    }
}

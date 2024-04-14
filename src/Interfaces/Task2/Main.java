package Interfaces.Task2;

public class Main {
    public static void main (String[] args) {
        System.out.println("Vehicle Demonstration\n");

        // Create instances of Car, Motorcycle, and Bus
        AbstractVehicle car = new Car();
        AbstractVehicle motorcycle = new Motorcycle();
        AbstractVehicle bus = new Bus();


        //start and stop method
        car.start();
        car.stop();
        System.out.println("Car Information:\n" + car.getInfo() + "\n");


        motorcycle.start();
        motorcycle.stop();
        System.out.println("Motorcycle Information:\n" + motorcycle.getInfo() + "\n");

        bus.start();
        bus.stop();
        System.out.println("Bus Information:\n" + bus.getInfo());
    }
}

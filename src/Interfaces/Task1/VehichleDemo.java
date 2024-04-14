package Interfaces.Task1;

public class VehichleDemo {
    public static void main (String[] args) {
        System.out.println("Vehicle Demonstration\n");

        //create instance
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

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

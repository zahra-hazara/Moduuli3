package Inheritance.Task2;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("City Bus", 50);
        bus.fillTank();

        // Simulate passengers entering and exiting
        bus.passengerEnter();
        bus.passengerEnter();
        System.out.println("Current passengers: " + bus.getPassengerCount());

        bus.passengerExit();
        System.out.println("Current passengers after exit: " + bus.getPassengerCount());

        // Accelerate the bus
        bus.accelerate();
        System.out.println("Bus Speed: " + bus.getSpeed() + ", Gasoline Level: " + bus.getGasolineLevel());
    }
}



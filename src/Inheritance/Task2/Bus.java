package Inheritance.Task2;
import Inheritance.Task1.Car;
public class Bus extends Car {
    private int passengers;
    private final int capacity;

    public Bus(String typeName, int capacity) {
        super(typeName);
        this.capacity = capacity;
        this.passengers = 0;
    }

    public void passengerEnter() {
        if (passengers < capacity) {
            passengers++;
        } else {
            System.out.println("Bus is full! Cannot enter.");
        }
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
        } else {
            System.out.println("No passengers to exit.");
        }
    }

    public int getPassengerCount() {
        return passengers;
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.accelerate(); // Call the parent class's accelerate method
            useGasoline(1); // Use additional gasoline for the bus
        }
    }

}
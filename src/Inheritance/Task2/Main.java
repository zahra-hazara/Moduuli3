package Inheritance.Task2;

public class Main {
    public static void main(String[] args) {
        // Creating a new Bus object
        Bus myBus = new Bus("Toyota", "Coaster", 2020);

        // Adding passengers
        myBus.passengerEnter(10);

        // Printing out the current passenger count
        System.out.println("Passenger count: " + myBus.getPassengers());

        // Exiting some passengers
        myBus.passengerExit(5);

        // Printing out the updated passenger count
        System.out.println("Passenger count after exiting: " + myBus.getPassengers());

        // Printing out the bus details
        System.out.println(myBus);
    }
}



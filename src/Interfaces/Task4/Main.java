package Interfaces.Task4;

public class Main {
    public static void main(String[] args) {
        // Create instances of vehicles
        Car car = new Car(25);// 25 miles per gallon
        Motorcycle motorcycle = new Motorcycle(50); // 50 miles per gallon
        ElectricCar electricCar = new ElectricCar(0.2); // 0.2 kWh per kilometer
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle(0.15); // 0.15 kWh per kilometer

        System.out.println("--- Electric Vehicles ---");
        System.out.println(electricCar.getInfo());
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println(electricMotorcycle.getInfo());
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge();

        // Demonstrate fuel efficiency calculation
        System.out.println("--- Fuel Efficiency Calculation ---");
        System.out.println("Car fuel efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("Motorcycle fuel efficiency: " + motorcycle.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("Electric Car fuel efficiency: " + electricCar.calculateFuelEfficiency() + " kWh per kilometer");
        System.out.println("Electric Motorcycle fuel efficiency: " + electricMotorcycle.calculateFuelEfficiency() + " kWh per kilometer");
    }
}

package Interfaces.Task4;

// Interface for Vehicles
public interface Vehicle2 {
    void start();
    void stop();
    String getInfo();
    double calculateFuelEfficiency();
}

// Abstract class for Vehicles
abstract class AbstractVehicle implements Vehicle2 {
    private String type;
    private double fuelEfficiency;

    public AbstractVehicle(String type, double fuelEfficiency) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getType() {
        return type;
    }

    public void charge() {
        System.out.println("Charging " + getType() + "...");
    }
    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}

// Concrete class for Cars
class Car extends AbstractVehicle {
    public Car(double fuelEfficiency) {
        super("Car", fuelEfficiency); // Pass fuel efficiency provided to superclass constructor
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Car Info"; // Provide meaningful information about the car
    }
}

// Concrete class for Motorcycles
class Motorcycle extends AbstractVehicle {
    public Motorcycle(double fuelEfficiency) {
        super("Motorcycle", fuelEfficiency);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Info";
    }
}

// Concrete class for Electric Cars
class ElectricCar extends AbstractVehicle {
    private double kWhPerKilometer;

    public ElectricCar(double kWhPerKilometer) {
        super("Electric Car", 0); // Assume electric cars do not consume fuel, so set fuel efficiency to 0
        this.kWhPerKilometer = kWhPerKilometer;
    }

    @Override
    public void start() {
        System.out.println("Electric Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Info";
    }

    @Override
    public double calculateFuelEfficiency() {
        return kWhPerKilometer;
    }
}

// Concrete class for Electric Motorcycles
class ElectricMotorcycle extends AbstractVehicle {
    private double kWhPerKilometer;

    public ElectricMotorcycle(double kWhPerKilometer) {
        super("Electric Motorcycle", 0); // Assume electric motorcycles do not consume fuel, so set fuel efficiency to 0
        this.kWhPerKilometer = kWhPerKilometer;
    }

    @Override
    public void start() {
        System.out.println("Electric Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Info";
    }

    @Override
    public double calculateFuelEfficiency() {
        return kWhPerKilometer;
    }
}

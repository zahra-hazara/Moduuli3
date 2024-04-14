package Interfaces.Task3;

// Interface for Electric Vehicles
interface ElectricVehicle {
    void charge();
}

// Interface for Vehicles
public interface Vehicle extends ElectricVehicle {
    void start();
    void stop();
    String getInfo();
}

abstract class AbstractVehicle implements Vehicle {
    private String type;

    public AbstractVehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // Additional abstract methods that subclasses must implement
    abstract String getFuel();
    abstract String getColor();

    // Implementing the charge() method for electric vehicles
    @Override
    public void charge() {
        System.out.println("Charging " + getType() + "...");
    }
}

class Car extends AbstractVehicle {
    public Car() {
        super("Car");
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
        return "Type: Car\nFuel: " + getFuel() + "\nColor: " + getColor();
    }

    // Implement abstract methods from AbstractVehicle
    @Override
    String getFuel() {
        return "Petrol";
    }

    @Override
    String getColor() {
        return "Red";
    }
}

class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Motorcycle");
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
        return "Type: Motorcycle\nFuel: " + getFuel() + "\nColor: " + getColor();
    }

    // Implement abstract methods from AbstractVehicle
    @Override
    String getFuel() {
        return "Gasoline";
    }

    @Override
    String getColor() {
        return "Black";
    }
}

class Bus extends AbstractVehicle {
    public Bus() {
        super("Bus");
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return "Type: Bus\nFuel: " + getFuel() + "\nCapacity: " + getCapacity();
    }

    // Implement abstract methods from AbstractVehicle
    @Override
    String getFuel() {
        return "Diesel";
    }

    String getCapacity() {
        return "40 passengers";
    }

    @Override
    String getColor() {
        return "Blue";
    }
}

class ElectricCar extends AbstractVehicle {
    public ElectricCar() {
        super("Electric Car");
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
        return "Type: Electric Car\nFuel: " + getFuel() + "\nColor: " + getColor();
    }

    // Implement abstract methods from AbstractVehicle
    @Override
    String getFuel() {
        return "Electricity";
    }

    @Override
    String getColor() {
        return "White";
    }
}

class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle() {
        super("Electric Motorcycle");
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
        return "Type: Electric Motorcycle\nFuel: " + getFuel() + "\nColor: " + getColor();
    }

    // Implement abstract methods from AbstractVehicle
    @Override
    String getFuel() {
        return "Electricity";
    }

    @Override
    String getColor() {
        return "Silver";
    }
}

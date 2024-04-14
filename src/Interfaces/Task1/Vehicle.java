package Interfaces.Task1;

public interface Vehicle {
    void start();
    void stop();
    String getInfo();
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("car is starting ...");
    }
    @Override
    public void stop() {
         System.out.println("car is stopping...");
    }

     @Override
    public String getInfo() {
        return "Type: Car\nFuel: Petrol\nColor: Red";
    }

}
class Motorcycle implements Vehicle {
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
        return "Type: Motorcycle\nFuel: Gasoline\nColor: Black";
    }
}
class Bus implements Vehicle {
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
        return "Type: Bus\nFuel: Diesel\nCapacity: 40 passengers";
    }
}


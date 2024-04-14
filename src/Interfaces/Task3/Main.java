package Interfaces.Task3;

public class Main {
    public static void main(String[] args) {
        // Create instances of vehicles
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();
        ElectricCar electricCar = new ElectricCar();
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();

        // Demonstrate behavior
        System.out.println("--- Non-Electric Vehicles ---");
        System.out.println(car.getInfo());
        car.start();
        car.stop();

        System.out.println(motorcycle.getInfo());
        motorcycle.start();
        motorcycle.stop();

        System.out.println(bus.getInfo());
        bus.start();
        bus.stop();

        System.out.println("--- Electric Vehicles ---");
        System.out.println(electricCar.getInfo());
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println(electricMotorcycle.getInfo());
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge();
    }
}

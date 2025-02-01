package Inheritance.Task1;
public class Main {
    public static void main(String[] args) {
        // Create a regular Car
        Car regularCar = new Car("Sedan");
        regularCar.fillTank(); // Fill the tank
        System.out.println("Regular Car Type: " + regularCar.getTypeName());

        // Accelerate the regular car
        regularCar.accelerate();
        System.out.println("Regular Car Speed after acceleration: " + regularCar.getSpeed());
        System.out.println("Regular Car Gasoline Level: " + regularCar.getGasolineLevel());

        // Create a SportsCar
        SportsCar sportsCar = new SportsCar("Ferrari");
        sportsCar.fillTank(); // Fill the tank
        System.out.println("\nSports Car Type: " + sportsCar.getTypeName());

        // Accelerate the sports car
        sportsCar.accelerate();
        System.out.println("Sports Car Speed after acceleration: " + sportsCar.getSpeed());
        System.out.println("Sports Car Gasoline Level: " + sportsCar.getGasolineLevel());

        // Accelerate again to see the effect
        sportsCar.accelerate();
        System.out.println("Sports Car Speed after second acceleration: " + sportsCar.getSpeed());
        System.out.println("Sports Car Gasoline Level after second acceleration: " + sportsCar.getGasolineLevel());
    }
}

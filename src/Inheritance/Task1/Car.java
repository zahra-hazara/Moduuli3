package Inheritance.Task1;
public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;

    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            useGasoline(1); // Use 1 unit of gasoline
        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
                useGasoline(0.5); // Use 0.5 units for deceleration
            }
        } else {
            speed = 0;
        }
    }

    protected void useGasoline(double amount) {
        gasolineLevel = Math.max(0, gasolineLevel - amount);
    }

    public void fillTank() {
        gasolineLevel = 100; // Fill the tank to full
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }
}

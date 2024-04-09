package Inheritance.Task1;

class SportsCar extends Car {
    int acceleration;
    int deceleration;
    double gasolineConsumption;

    SportsCar(String make, String model, int year) {
        super(make, model, year);
        this.acceleration = 10; // faster acceleration
        this.deceleration = 5; // faster deceleration
        this.gasolineConsumption = 2.5; // higher gasoline consumption
    }

    @Override
    public void accelerate(int acceleration) {
        super.accelerate(acceleration);
    }

    @Override
    public void decelerate(int deceleration) {
        super.decelerate(deceleration);
    }

    @Override
    public String toString() {
        return super.toString() + " (Sports Car)";
    }
}

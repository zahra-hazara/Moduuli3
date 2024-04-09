package Inheritance.Task2;

public class Bus extends Car {
    private int passengerCount;

    public Bus(String make, String model, int year) {
        super(make, model, year);
        this.passengerCount = 0;
    }

    public void passengerEnter(int count) {
        passengerCount += count;
    }

    public void passengerExit(int count) {
        if (passengerCount - count >= 0) {
            passengerCount -= count;
        } else {
            passengerCount = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " with " + passengerCount + " passengers on board";
    }
}


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
        if ((this.passengerCount - passengerCount) >= 0) {
            this.passengerCount -= passengerCount;
        } else {
            passengerCount = 0;
        }
    }
    public int getPassengers() {
        return passengerCount;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + passengerCount + " passengers on board";
    }
}


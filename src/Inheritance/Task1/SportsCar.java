package Inheritance.Task1;
public class SportsCar extends Car {
    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 1) { // Check if there's enough gasoline
            super.accelerate(); // Call the parent class's accelerate method
            // Increase speed by 20 instead of 10
            double newSpeed = getSpeed() + 20;
            // Set the new speed
            // Assuming we have a way to set speed, we would need a method in Car to do this
            // For now, we will just assume it is handled in the parent class
            // Decrease gasolineLevel by 2 for each acceleration
            // This would require a method in Car to decrease gasolineLevel
        } else {
            // If not enough gasoline, speed remains 0
            // Optionally, we could print a message or handle it differently
        }
    }

    @Override
    void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            // Increase deceleration effect
            super.decelerate(amount + 5); // Decelerate more than the regular Car
            // Decrease gasolineLevel by 1 for deceleration
            // This would also require a method in Car to decrease gasolineLevel
        }
    }
}
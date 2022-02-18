package module5.Mod5Prob1;

import java.util.InputMismatchException;

public class Cycle {
    // Class instance variables
    private double numberOfWheels;
    private double weight;

    // Constructor with parameters passed in
    public Cycle(double numberOfWheels, double weight) {
        try {
            if (numberOfWheels <= 0 || weight <= 0) {
                throw new IllegalArgumentException();
            }

            this.numberOfWheels = numberOfWheels;
            this.weight = weight;
        } catch (InputMismatchException e) {
            System.out.println("Inputs must be doubles.");
        }
    }

    // toString method to print out data from Cycle object
    @Override
    public String toString() {
        return "Cycle [numberOfWheels = " + numberOfWheels + ", weight = " + weight + "]";
    }
}

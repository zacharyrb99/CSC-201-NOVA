package module3.Mod3Problem2;

public class Cycle {
    // Class instance variables
    private int numberOfWheels;
    private int weight;

    // Default constructor
    public Cycle() {
        this.numberOfWheels = 100;
        this.weight = 1000;
    }

    // Constructor with parameters passed in
    public Cycle(int numberOfWheels, int weight) {
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }

    // toString method to print out data from Cycle object
    @Override
    public String toString() {
        return "Cycle [numberOfWheels = " + numberOfWheels + ", weight = " + weight + "]";
    }
}

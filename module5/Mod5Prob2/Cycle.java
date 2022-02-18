package module5.Mod5Prob2;

public class Cycle {
    // Class instance variables
    private int numberOfWheels;
    private int weight;

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
package module4.Mod4Problem4;

public class ElectronicEquipment {
    private double weight;
    private int cost;
    private String name;

    public ElectronicEquipment(double weight, int cost, String name) {
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String weightStr = "Weight: " + weight + " lbs";
        String costStr = "Cost: $" + cost;
        String nameString = "Name: " + name;

        return weightStr + "\n" + costStr + "\n" + nameString;
    }
}

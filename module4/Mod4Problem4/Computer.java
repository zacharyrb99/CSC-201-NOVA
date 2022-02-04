package module4.Mod4Problem4;

public class Computer extends ElectronicEquipment{
    private String brand;
    private String processor;

    public Computer(int weight, int cost, String name, String brand, String processor) {
        super(weight, cost, name);
        this.brand = brand;
        this.processor = processor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        System.out.println("Computer: ");
        String parentStr = super.toString();
        String brandStr = "Brand: " + brand;
        String processorStr = "Processor: " + processor;

        return parentStr + "\n" + brandStr + "\n" + processorStr;
    }
}

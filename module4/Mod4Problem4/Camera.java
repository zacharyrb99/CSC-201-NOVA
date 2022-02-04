package module4.Mod4Problem4;

public class Camera extends ElectronicEquipment {
    private String brand;
    private double mp;

    public Camera(int weight, int cost, String name, String brand, double mp) {
        super(weight, cost, name);
        this.brand = brand;
        this.mp = mp;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(double mp) {
        this.mp = mp;
    }

    public double getModel() {
        return mp;
    }

    @Override
    public String toString() {
        System.out.println("Camera: ");
        String parentStr = super.toString();
        String brandStr = "Brand: " + brand;
        String modelStr = "Megapizels: " + mp;

        return parentStr + "\n" + brandStr + "\n" + modelStr;
    }
}

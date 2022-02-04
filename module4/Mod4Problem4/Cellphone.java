package module4.Mod4Problem4;

public class Cellphone extends ElectronicEquipment {
    private String brand;
    private int year;
    private String phone_num;

    public Cellphone(double weight, int cost, String name, String brand, int year, String phone_num) {
        super(weight, cost, name);
        this.brand = brand;
        this.year = year;
        this.phone_num = phone_num;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPhoneNum(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getPhoneNum() {
        return phone_num;
    }

    @Override
    public String toString() {
        System.out.println("Cellphone: ");
        String parentStr = super.toString();
        String brandStr = "Brand: " + brand;
        String yearStr = "Year Released: " + year;
        String phoneStr = "Phone Number: " + phone_num;

        return parentStr + "\n" + brandStr + "\n" + yearStr + "\n" + phoneStr;
    }
}

package module4.Mod4Problem4;

public class App {
    public static void main(String[] args) {
        Cellphone iphone = new Cellphone(1.5, 1200, "iPhone 13", "Apple", 2021, "555-555-5555");
        Computer pc = new Computer(15, 2500, "XPS Desktop", "Dell", "11th Gen Intel Core i9");
        Camera sony = new Camera(5, 6500, "Alpha 1", "Sony", 50.1);

        System.out.println(iphone.toString());
        System.out.println();
        System.out.println(pc.toString());
        System.out.println();
        System.out.println(sony.toString());
    }
}

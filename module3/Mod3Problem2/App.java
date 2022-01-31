package module3.Mod3Problem2;

public class App {
    public static void main(String[] args) {
        Cycle defaultCycle = new Cycle(); // Creates a cycle with no parameters passed in
        Cycle customCycle = new Cycle(200, 2000); // Creates a cycle with both parameters passed in

        System.out.println(defaultCycle.toString());
        System.out.println(customCycle.toString());
    }
}

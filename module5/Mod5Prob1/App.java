package module5.Mod5Prob1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Insert weight: ");
            double weight = scan.nextDouble();
            System.out.println("Insert number of wheels: ");
            double numWheels = scan.nextDouble();

            try {
                Cycle customCycle = new Cycle(weight, numWheels); // Creates a cycle with both parameters passed in
                System.out.println(customCycle.toString());
            } catch (IllegalArgumentException e) {
                System.out.println("Input must be > 0.");
            }

            scan.close();
        } catch (InputMismatchException e) {
            System.out.println("Input types must be doubles.");
        } 
    }
}

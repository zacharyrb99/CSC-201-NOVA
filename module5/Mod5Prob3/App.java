package module5.Mod5Prob3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            File file = new File("module5/Mod5Prob3/Cycle.txt");
            Scanner scan = new Scanner(file);

            int wheels = Integer.parseInt(scan.nextLine());
            int weight = Integer.parseInt(scan.nextLine());

            Cycle cycle = new Cycle(wheels, weight);
            System.out.println(cycle.toString());

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

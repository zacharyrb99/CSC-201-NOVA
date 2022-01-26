package module1.Mod1Problem4;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your first real number.");
        int real1 = scan.nextInt();
        System.out.println(real1);

        System.out.println("Input your second real number.");
        int real2 = scan.nextInt();
        System.out.println(real2);

        System.out.println("Input your first imaginary number.");
        int imag1 = scan.nextInt();
        System.out.println(imag1);

        System.out.println("Input your second imaginary number.");
        int imag2 = scan.nextInt();
        System.out.println(imag2);

        ComplexNums operations = new ComplexNums(real1, real2, imag1, imag2);
        operations.printResults();

        scan.close();
    }
}

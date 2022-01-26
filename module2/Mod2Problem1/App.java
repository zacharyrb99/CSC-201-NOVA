package module2.Mod2Problem1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count1 = 0; // 0-10 boxes sold
        int count2 = 0; // 11-20 boxes sold
        int count3 = 0; // 21-30 boxes sold
        int count4 = 0; // 31-40 boxes sold 
        int count5 = 0; // >=41 boxes sold

        System.out.println("Total number of girls in the troop: ");
        int girlScouts = scan.nextInt();

        int[] arrOfCookieCounts = new int[girlScouts]; // Array with length = number of girlScouts
        
        // Loop to gather number of boxes sold for each girl scout
        for (int i = 1; i <= girlScouts; i++) {
            System.out.println(String.format("Boxes of cookies for girl #%d", i));
            int cookieCount = scan.nextInt();
            arrOfCookieCounts[i - 1] = cookieCount;
        }

        // Loop to increment counts based on number of boxes sold
        for (int i = 0; i < girlScouts; i++) {
            if (arrOfCookieCounts[i] >= 0 && arrOfCookieCounts[i] < 11) {
                count1++;
            } else if (arrOfCookieCounts[i] >= 11 && arrOfCookieCounts[i] < 21) {
                count2++;
            } else if (arrOfCookieCounts[i] >= 21 && arrOfCookieCounts[i] < 31) {
                count3++;
            } else if (arrOfCookieCounts[i] >= 31 && arrOfCookieCounts[i] < 41) {
                count4++;
            } else if (arrOfCookieCounts[i] >= 41) {
                count5++;
            }
        }

        // Display data to user
        System.out.println();
        System.out.println("Number of girls scouts for each box total: ");
        System.out.println(String.format("0 to 10 boxes: %d", count1));
        System.out.println(String.format("11 to 20 boxes: %d", count2));
        System.out.println(String.format("21 to 30 boxes: %d", count3));
        System.out.println(String.format("31 to 40 boxes: %d", count4));
        System.out.println(String.format("41 or more boxes: %d", count5));  

        scan.close();
    }
}

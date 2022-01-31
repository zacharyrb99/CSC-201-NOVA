package module2.Mod2Problem3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[][] temps = inputTempForYear();
        float averageLow = calculateAverageLow(temps);
        float averageHigh = calculateAverageHigh(temps);
        int lowIdx = findLowestTemp(temps);
        int highIdx = findHighestTemp(temps);

        System.out.println(String.format("The highest temperature this year was: %s in %s", temps[highIdx][1], months[highIdx]));
        System.out.println(String.format("The lowest temperature this year was: %s in %s", temps[lowIdx][0], months[lowIdx]));
        System.out.println(String.format("The average high temperature of each month was: %s", averageHigh));
        System.out.println(String.format("The average low temperature of each month was: %s", averageLow));
    }

    public static void inputTempForMonth(int month, int[][] temps) {
        Scanner scan = new Scanner(System.in);
        int high, low;

        if (month == 0) {
            System.out.println("Input highest temp for January: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for January: ");
            low = scan.nextInt();

            temps[0][0] = low;
            temps[0][1] = high;
        } else if (month == 1) {
            System.out.println("Input highest temp for February: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for February: ");
            low = scan.nextInt();

            temps[1][0] = low;
            temps[1][1] = high;
        } else if (month == 2) {
            System.out.println("Input highest temp for March: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for March: ");
            low = scan.nextInt();

            temps[2][0] = low;
            temps[2][1] = high;
        } else if (month == 3) {
            System.out.println("Input highest temp for April: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for April: ");
            low = scan.nextInt();

            temps[3][0] = low;
            temps[3][1] = high;
        } else if (month == 4) {
            System.out.println("Input highest temp for May: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for May: ");
            low = scan.nextInt();

            temps[4][0] = low;
            temps[4][1] = high;
        } else if (month == 5) {
            System.out.println("Input highest temp for June: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for June: ");
            low = scan.nextInt();

            temps[5][0] = low;
            temps[5][1] = high;
        } else if (month == 6) {
            System.out.println("Input highest temp for July: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for July: ");
            low = scan.nextInt();

            temps[6][0] = low;
            temps[6][1] = high;
        } else if (month == 7) {
            System.out.println("Input highest temp for August: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for August: ");
            low = scan.nextInt();

            temps[7][0] = low;
            temps[7][1] = high;
        } else if (month == 8) {
            System.out.println("Input highest temp for September: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for September: ");
            low = scan.nextInt();

            temps[8][0] = low;
            temps[8][1] = high;
        } else if (month == 9) {
            System.out.println("Input highest temp for October: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for October: ");
            low = scan.nextInt();

            temps[9][0] = low;
            temps[9][1] = high;
        } else if (month == 10) {
            System.out.println("Input highest temp for November: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for November: ");
            low = scan.nextInt();

            temps[10][0] = low;
            temps[10][1] = high;
        } else if (month == 11) {
            System.out.println("Input highest temp for December: ");
            high = scan.nextInt();
            System.out.println("Input lowest temp for December: ");
            low = scan.nextInt();

            temps[11][0] = low;
            temps[11][1] = high;
        }
    }

    public static int[][] inputTempForYear() {
        int[][] temps = new int[12][2];

        for (int i = 0; i < 12; i++) {
            inputTempForMonth(i, temps);
        }

        return temps;
    }

    public static float calculateAverageLow(int[][] temps) {
        float sumLow = 0;
        float avgLow;

        for (int i = 0; i < temps.length; i++){
            sumLow += temps[i][0];
        }

        avgLow = sumLow / temps.length;
        return avgLow;
    }

    public static float calculateAverageHigh(int[][] temps) {
        float sumHigh = 0;
        float avgHigh;

        for (int i = 0; i < temps.length; i++) {
            sumHigh += temps[i][1];
        }

        avgHigh = sumHigh / temps.length;
        return avgHigh;
    }

    public static int findHighestTemp(int[][] temps) {
        int high = temps[0][1];
        int highIdx = 0;
        
        for (int i = 0; i < temps.length; i++) {
            if (high < temps[i][1]) {
                high = temps[i][1];
                highIdx = i;
            }
        }

        return highIdx;
    }

    public static int findLowestTemp(int[][] temps) {
        int low = temps[0][0];
        int lowIdx = 0;

        for (int i = 0; i < temps.length; i++) {
            if (low > temps[i][0]) {
                low = temps[i][0];
                lowIdx = i;
            }
        }

        return lowIdx;
    }
}

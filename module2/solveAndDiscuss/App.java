package module2.solveAndDiscuss;
import java.util.Scanner;

/*
Chapter 7 # 3 - Count occurrence of numbers

Write a program that reads the integers between 1 and 100 and counts the occurences of each.
Assume the input ends with 0, here is a sample:
    Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 ENTER
    2 occurs 2 times
    3 occurs 1 time
    4 occurs 1 time
    5 occurs 2 times
    6 occurs 1 time
    23 occurs 1 time
    43 occurs 1 time
*/

public class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrOfVals = new int[100];
        System.out.println(arrOfVals);
        int input;
        int count = 0;

        System.out.println("Enter the integers between 1 and 100: ");
    
        do {
            input = scan.nextInt();
            arrOfVals[count] = input;
            count++;
        } while (input != 0);

        countOccurences(arrOfVals);

        scan.close();
    }

    public static void countOccurences(int[] list) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i) {
                    count++;
                }
            }

            if (count != 0) {
                System.out.println(String.format("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time"));
            }
        }
    }
}
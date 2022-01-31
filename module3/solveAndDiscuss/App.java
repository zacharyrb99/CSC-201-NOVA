package module3.solveAndDiscuss;
import java.util.Scanner;

/*
    Write a program that prompts the user to enter two characters and displays the major and status represented in the characters.
    The first character indicates the major:
        M = mathematics
        C = Computer Science
        I = Information Technology
    The second character indicates the students year: 
        1 = freshman 
        2 = sophomore 
        3 = junior 
        4 = senior

    Examples:
    1. M1 -> Mathematics Freshman
    2. C3 -> Computer Science Junior
    3. T3 -> Invalid Input
*/

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char majorChar;
        char yearChar;
        String major;
        String year;

        System.out.println("Enter two characters: ");
        String input = scan.nextLine();
        majorChar = input.charAt(0);
        yearChar = input.charAt(1);
    
        if (input.length() > 2) {
            System.out.println("Invalid input.");
            scan.close();
            return;
        } 
        
        if (majorChar == 'M') {
            major = "Mathematics";
        } else if (majorChar == 'C') {
            major = "Computer Science";
        } else if (majorChar == 'I') {
            major = "Information Technology";
        } else {
            System.out.println("Invalid input.");
            scan.close();
            return;
        }

        if (yearChar == '1') {
            year = "Freshman";
        } else if (yearChar == '2') {
            year = "Sophomore";
        } else if (yearChar == '3') {
            year = "Junior";
        } else if (yearChar == '4') {
            year = "Senior";
        } else {
            System.out.println("Invalid input.");
            scan.close();
            return;
        }

        System.out.println(major + " " + year);
        scan.close();
    }
}

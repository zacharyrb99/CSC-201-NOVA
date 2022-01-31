package module3.Mod3Problem4;

import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scanner for input
        System.out.println("Type in 'Java is fun! '."); // prompt for user
        String str1 = scan.nextLine();
        StringBuilder sb = new StringBuilder(str1); // makes string builder object with user input

        sb.append("I love it!"); // append "I love it!" to sb object
        sb.insert(str1.length(), "Yes, "); // insert "Yes, " inbetween first input and "I love it!"

        System.out.println(sb);
        scan.close();
    }
}

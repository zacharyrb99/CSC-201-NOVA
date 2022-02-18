package module5.solveAndDiscuss;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    Write a program that removes all the occurences of a specified string from a test file. 
    
    Example: java Exercise12_11 John filename
        removes the string 'John' from the specified file. 
        
    Your program should get the arguments from the command line.
*/

public class App {
    public static void main(String[] args) {
        //Checks for correct arguments
        if (args.length != 2) {
            System.out.println("Invalid arguments, need a string and a file name.");
            System.out.println("Example: java module5.solveAndDiscuss.App she text.txt");
            return;
        }

        File file = new File("module5/solveAndDiscuss/" + args[1]);

        //Checks if file exists in current directory
        if(!file.exists()) {
            System.out.println(args[1] + " does not exist.");
            return;
        }

        String s = "";

        //Grabs text from file and creates string
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()) {
                s += scan.nextLine();
            }

            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        s = s.replaceAll(args[0], ""); //Removes all instances of given string for the text file

        //Replaces old text with new text
        try {
            PrintWriter output = new PrintWriter(file);
            output.write(s);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(args[0] + " has been removed from " + args[1]);
    }
}
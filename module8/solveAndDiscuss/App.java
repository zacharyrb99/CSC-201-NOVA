package module8.solveAndDiscuss;

import java.io.*;

/*
    Chapter 17 Problem 3:

    Suppose a binary data file named Exercise17_02.dat has been created from Programming Exercise 17.2 and its data
    are created using writeInt(int) in DataOutputStream. The file contains an unspecified number of integers. Write a 
    program to find the sum of the integers.
*/

public class App {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        FileInputStream fis = new FileInputStream("module8/solveAndDiscuss/Exercise17_02.dat");

        try(DataInputStream dis = new DataInputStream(fis)) {
            while (true) {
                sum += dis.readInt();
            }
        } catch (EOFException eof) {
            System.out.println("End of file");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("The sum of the values in the file is: " + sum);
    }
}

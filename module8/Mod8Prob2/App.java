package module8.Mod8Prob2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class App {
    public static void main(String[] args) {
        try {
            RandomAccessFile pledge = new RandomAccessFile("module8/Mod8Prob2/Pledge.txt", "r");
            pledge.seek(124);
            System.out.println(pledge.readChar());
            pledge.seek(135);
            System.out.println(pledge.readChar());
            pledge.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

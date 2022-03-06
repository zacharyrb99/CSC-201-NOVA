package module8.Mod8Prob1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,4);
        Fraction f3 = new Fraction(8,10);
		
        try {
            FileOutputStream outFile = new FileOutputStream("module8/Mod8Prob1/SerialF.dat");
            ObjectOutputStream objOutput = new ObjectOutputStream(outFile);
            objOutput.writeObject(f1);
            objOutput.writeObject(f2);
            objOutput.writeObject(f3);
            objOutput.close();
            outFile.close();

            System.out.println("Success, check SerialF.dat");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
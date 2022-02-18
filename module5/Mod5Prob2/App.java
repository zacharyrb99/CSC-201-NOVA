package module5.Mod5Prob2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class App {
    public static void main(String[] args) {
        try {
            Cycle cycle = new Cycle(100, 1000);
            
            File file = new File("module5/Mod5Prob2/Cycle.txt");
            if (!file.exists()) {
                throw new IOException();
            }

            FileWriter write = new FileWriter("module5/Mod5Prob2/Cycle.txt");
            write.write(cycle.toString());
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

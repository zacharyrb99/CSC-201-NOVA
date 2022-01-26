package module1.Mod1Problem4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ComplexNumsTest {
    public static void main(String[] args) {
        ComplexNumsTest1();
    }

    public static void ComplexNumsTest1() {
        String data = "1" + "\n2" + "\n3" + "\n4";
        
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        App.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String output = byteArrayOutputStream.toString();
        System.out.println(output);
    }
}

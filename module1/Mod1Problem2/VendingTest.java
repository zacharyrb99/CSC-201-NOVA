package module1.Mod1Problem2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class VendingTest {
    public static void main(String[] args) {
        VendingTest1();
        VendingTest2();
        VendingTest3();
    }

    public static void VendingTest1() {
        String data = "5.00" + "\n0" + "\n1";
        
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

    public static void VendingTest2() {
        String data = "5.00" + "\n0.25" + "\n0.05" + "\n0.01" + "\n0" + "\n4";
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

    public static void VendingTest3() {
        String data = "0.25" + "\n0.10" + "\n1.00" + "\n0" + "\n2";
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
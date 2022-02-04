package module4.Mod4Problem2;

public class App {
    public static void main(String[] args) {
        Book rp1 = new Book("Ready Player One", 374, "Ernest Cline", "Sci-Fi", "Wade Watts");
        System.out.println(rp1.toString());
        System.out.println();

        Textbook textbook = new Textbook("Intro to Java Programming", 799, "Y. Daniel Liang", "Computer Science");
        System.out.println(textbook.toString());
        System.out.println();

        Magazine mag = new Magazine("Discover", 65, "Science", "November 2020");
        System.out.println(mag.toString());
    }
}

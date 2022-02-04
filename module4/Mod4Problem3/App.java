package module4.Mod4Problem3;

public class App {
    public static void main(String[] args) {
        Math mth263 = new Math("Calculus 1", 263, "MTH", "Dr. Smith", 3);
        CS cs201 = new CS("Intro to Computer Science", 201, "CSC", "Dr. Smith", 2, 2);
        Art art105 = new Art("Intro to Painting", 105, "ART", "Dr. Jones", 4);

        System.out.println(mth263.toString());
        System.out.println();
        System.out.println(cs201.toString());
        System.out.println();
        System.out.println(art105.toString());
    }
}

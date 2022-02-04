package module4.Mod4Problem1;

public class App {
    public static void main(String[] args) {
        System.out.println("Sports: ");
        System.out.println();

        Football fb = new Football("Football", 35, 21, 4);
        System.out.println(fb.toString());
        System.out.println();

        Basketball bball = new Basketball("Basketball", 103, 110, 8);
        System.out.println(bball.toString());
        System.out.println();

        Baseball baseball = new Baseball("Baseball", 12, 8, 3);
        System.out.println(baseball.toString());
    }
}

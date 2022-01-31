package module3.Mod3Problem1;

public class App {
    public static void main(String[] args) {
        CombinationLock mickeyLock = new CombinationLock(28, 17, 39);
        Locker mickeyLocker = new Locker(100, "Mickey Mouse", 3, mickeyLock);

        CombinationLock donaldLock = new CombinationLock(35, 16, 27);
        Locker donaldLocker = new Locker(275, "Donald Duck", 0, donaldLock);

        mickeyLocker.openLocker();
        System.out.println();

        mickeyLocker.putBookInLocker();
        mickeyLocker.putBookInLocker();
        mickeyLocker.putBookInLocker();

        System.out.println();
        donaldLocker.removeBookFromLocker();

        System.out.println();
        System.out.println(mickeyLocker.toString());
        System.out.println(donaldLocker.toString());
    }
}
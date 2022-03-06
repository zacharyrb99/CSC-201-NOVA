package module8.finalProject;

public class App {
    public static void main(String[] args) {
        Checking checkingAcct = new Checking("Zach Boudreaux", 1000);
        Savings savingsAcct = new Savings("Zach Boudreaux", 10000);

        checkingAcct.showMenu();
        savingsAcct.showMenu();
    }
}

package module8.finalProject;

public class Account {
    // Class variables
    private String customerName;
    private double balance;
    private int previousTransactionAmt;
    private String previousTransactionType;
    

    // Constructor
    public Account (String name, double amount) {
        this.balance = amount;
        this.customerName = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public String getName() {
        return customerName;
    }

    public void setPrevTransAmt(int amt) {
        this.previousTransactionAmt = amt;
    }

    public int getPrevTransAmt() {
        return previousTransactionAmt;
    }

    public void setPrevTransType(String type) {
        this.previousTransactionType = type;
    }

    public String getPrevTransType() {
        return previousTransactionType;
    }
    
    // Deposit money into account
    public void deposit (int amount) {
        if (amount == 0) {
            System.out.println("You must deposit more than $0.");
        } else {
            balance = balance + amount;
            previousTransactionAmt = amount;
            previousTransactionType = "Deposit";
        }
    }

    // Withdraw money from account
    public void withdraw (int amount) {
        if (amount > balance) {
            System.out.println("You cannot withdraw more than your balance. Current balance: $" + balance + ".");
        } else if (amount == 0) {
            System.out.println("You must withdraw more than $0");
        } else {
            balance = balance - amount;
            previousTransactionAmt = amount;
            previousTransactionType = "Withdraw";
        }
    }

    // Get previous transaction information
    public String getPreviousTransation() {
        return String.format("%s $%s", previousTransactionType, previousTransactionAmt);
    }
    
    @Override
    public String toString() {
        String nameStr = "Customer Name: " + customerName;
        String balanceStr = "Current Balance: " + balance;

        return nameStr + "\n" + balanceStr;
    }
}

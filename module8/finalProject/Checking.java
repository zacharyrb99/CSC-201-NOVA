package module8.finalProject;

import java.util.Scanner;

public class Checking extends Account {
    private double cashBackPct = 0.01;
    private double balance = super.getBalance();
    private String acctType = "Checking";

    public Checking (String name, double amount) {
        super(name, amount);
    }

    public void spend(int amount) {
        if (amount > balance) {
            System.out.println("You're account doesn't have enough balance to buy that. Balance: $" + balance + ".");
        } else {
            super.withdraw(amount);
            super.setPrevTransType("Purchase");
            double cashBack = amount * cashBackPct;
            balance = super.getBalance() + cashBack;
            System.out.println(String.format("Success, purchase complete. Cashback: $%s", cashBack));
        }
    }

    void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + super.getName() + "!");
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Buy Something");
		System.out.println("F. See Account Info");
        System.out.println("G. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			// Case 'A' allows the user to check their account balance
			case 'A':
				System.out.println("====================================");
				System.out.println("Balance = $" + balance);
				System.out.println("====================================");
				System.out.println();
				break;
			// Case 'B' allows the user to deposit money into their account using the 'deposit' function
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
			// Case 'C' allows the user to withdraw money from their account using the 'withdraw' function
			case 'C':
				System.out.println("Enter an amount to withdraw: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
			// Case 'D' allows the user to view their most recent transaction using the 'getPreviousTransaction' function
			case 'D':
				System.out.println("====================================");
				System.out.println(String.format("Previous Transaction: %s %s", super.getPrevTransType(), super.getPrevTransAmt()));
				System.out.println("====================================");
				System.out.println();
				break;
			// Case 'E' calculates the accrued interest on the account after a number of years specified by the user
			case 'E':
				System.out.println("What is the price of your item: ");
				int price = scanner.nextInt();
				spend(price);
				break;
			// Case 'F' shows account info
			case 'F':
				System.out.println(this.toString());
                break;
            // Case 'G' exits the user from their account
            case 'G':
                System.out.println("====================================");
				break;
			// The default case let's the user know that they entered an invalid character and how to enter a valid one
			default:
				System.out.println("Error: invalid option. Please enter A, B, C, D, or E or access services.");
				break;
			}
		} while(option != 'G');

		System.out.println("Thank you for banking with us!");
	}

    @Override
    public String toString() {
        String parentStr = super.toString();
        String acctTypeStr = "Account Type: " + acctType;
        String cashBackPctStr = "Cash Back Percent: " + (cashBackPct * 100) + "%";

        return parentStr + "\n" + acctTypeStr + "\n" + cashBackPctStr;
    }
}

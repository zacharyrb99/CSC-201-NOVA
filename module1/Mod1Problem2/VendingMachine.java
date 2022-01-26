package module1.Mod1Problem2;
import java.util.Scanner; // allows for user input

public class VendingMachine {
    Scanner scan = new Scanner(System.in);

    // Class Variables
    int item;
    double price = 0;
    double credit = 0;
    double change = 0;
    int choiceCount = 0;

    // Function to accept money from user input
    void acceptMoney() {
        System.out.println("Please enter your money in coins or $1/$5 bills (input 0 to proceed to selection): ");
        String input = scan.nextLine();

        while (input != "0") {
            switch (input) {
                // Penny input
                case "0.01":
                    credit = credit + Double.parseDouble(input);
                    System.out.println("Current credit: " + credit + ", input more money or press 0 to select your items:");
                    input = scan.nextLine();
                    break;
                    
                // Nickel input
                case "0.05":
                    credit = credit + Double.parseDouble(input);
                    System.out.println("Current credit: " + credit + ", input more money or press 0 to select your items:");
                    input = scan.nextLine();
                    break;

                // Dime input
                case "0.10":
                    credit = credit + Double.parseDouble(input);
                    System.out.println("Current credit: " + credit + ", input more money or press 0 to select your items:");
                    input = scan.nextLine();
                    break;

                // Quarter input
                case "0.25":
                    credit = credit + Double.parseDouble(input);
                    System.out.println("Current credit: " + credit + ", input more money or press 0 to select your items:");
                    input = scan.nextLine();
                    break;

                // 1 Dollar input
                case "1.00":
                    credit = credit + Double.parseDouble(input);
                    System.out.println("Current credit: " + credit + ", input more money or press 0 to select your items:");
                    input = scan.nextLine();
                    break;

                // 5 Dollar input
                case "5.00":
                    credit = credit + Double.parseDouble(input);
                    System.out.println("Current credit: " + credit + ", input more money or press 0 to select your items:");
                    input = scan.nextLine();
                    break;

                // Finish money input, go to item select
                case "0":
                    System.out.println("Current credit: " + credit);
                    chooseItem();
                    return;

                // Invalid input handler
                default:
                    System.out.println("Invalid input: " + input);
                    System.out.println("Valid Inputs: 0.01, 0.05, 0.10, 0.25, 1.00, 5.00, 0");
                    input = scan.nextLine();
            }
        }

        // scan.close();
    }

    void chooseItem() {
        // Scanner scan = new Scanner(System.in);

        System.out.println("Hi, please choose which snack you would like: ");
        System.out.println();
        System.out.println("1: Doritos - $1.50");
        System.out.println("2: Skittles - $1.00");
        System.out.println("3: Cheetos - $1.50");
        System.out.println("4: Gatorade - $2.75");
        System.out.println("5: Sprite - $2.00");
        System.out.println("0: Cancel Transaction");
        System.out.println();

        item = scan.nextInt();

        if (choiceCount < 4) {
            if (item == 1) {
                // Doritos selection

                if (credit < 1.50) {
                    choiceCount = choiceCount + 1;
                    System.out.println("You haven't put in enough money, choose a different item. You put in $" + credit);
                    System.out.println();
                    chooseItem();
                } else {
                    price = 1.50;
                    System.out.println("Here are your Doritos!");
                    returnChange();
                }
            } else if (item == 2) {
                // Skittles selection

                if (credit < 1.00) {
                    choiceCount = choiceCount + 1;
                    System.out.println("You haven't put in enough money, choose a different item. You put in $" + credit);
                    System.out.println();
                    chooseItem();
                } else {
                    price = 1.00;
                    System.out.println("Here are your Skittles!");
                    returnChange();
                }
            } else if (item == 3) {
                // Cheetos selection

                if (credit < 1.50) {
                    choiceCount = choiceCount + 1;
                    System.out.println("You haven't put in enough money, choose a different item. You put in $" + credit);
                    System.out.println();
                    chooseItem();
                } else {
                    price = 1.50;
                    System.out.println("Here are your Cheetos!");
                    returnChange();
                }
            } else if (item == 4) {
                // Gatorade selection

                if (credit < 2.75) {
                    choiceCount = choiceCount + 1;
                    System.out.println("You haven't put in enough money, choose a different item. You put in $" + credit);
                    System.out.println();
                    chooseItem();
                } else {
                    price = 2.75;
                    System.out.println("Here is your Gatorade!");
                    returnChange();
                }
            } else if (item == 5) {
                // Sprite selection

                if (credit < 2.00) {
                    choiceCount = choiceCount + 1;
                    System.out.println("You haven't put in enough money, choose a different item. You put in $" + credit);
                    System.out.println();
                    chooseItem();
                } else {
                    price = 2.00;
                    System.out.println("Here is your Sprite!");
                    returnChange();
                }
            } else if (item == 0) {
                // Cancel transaction

                returnChange();
            } else {
                // invalid input handling

                System.out.println("Invalid input, please input 1, 2, 3, 4, 5, or 0.");
                chooseItem();
            }
        } else {
            returnChange();
        }
    }

    void returnChange() {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        
        double unroundedChange = credit - price;
        double roundedChange = Math.round(unroundedChange * 100);
        double originalChange = roundedChange / 100;
        change = originalChange;
        

        while (change > 0) {
            if (change >= 0.25) {
                quarters = quarters + 1;
                change = change - 0.25;
            } else if (change >= 0.10 && change < 0.25) {
                dimes = dimes + 1;
                change = change - 0.10;
            } else if (change >= 0.05 && change < 0.10) {
                nickels = nickels + 1;
                change = change - 0.05;
            } else if (change >= 0.01 && change < 0.05) {
                pennies = pennies + 1;
                change = change - 0.01;
            } else if (change < 0.01) {
                return;
            }

            change = Math.round(change * 100);
            change = change / 100;
        }

        System.out.println("Here is your change: $" + originalChange);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }

    void processTransaction() {
        acceptMoney();
    }
}

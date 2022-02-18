package module6.solveAndDiscuss;

/*
    Chapter 13 Problem #16
    Write a program similar to Listing 7.9, Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10.
    You will need to use the split method in the String class, introduced in Section 10.10.3, Replacing and Splitting Strings,
    to retrieve the numerator string and denominator string, and convert strings into integers using hte Integer.parseInt method.
*/

public class App {
    public static void main(String[] args) {
        // Incorrect input handler
        if(args.length != 1) {
            System.out.println("Incorrect input. Ex: java solveAndDiscuss '1/2 + 1/5'");
            return;
        }

        // Create string and Rational for output after calculations
        String output = args[0];
        Rational solution;
        
        // Get numerator/denominator
        String[] str = (args[0].replaceAll(" ", "/")).split("/");
        
        // Create Rational objects
        Rational r1 = new Rational(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        Rational r2 = new Rational(Integer.parseInt(str[3]), Integer.parseInt(str[4]));

        switch (str[2]) {
            case "+":
                solution = r1.add(r2);
                output += " = " + solution.toString();
                break;
            case "-":
                solution = r1.subtract(r2);
                output += " = " + solution.toString();
                break;
            case "*":
                solution = r1.multiply(r2);
                output += " = " + solution.toString();
                break;
            case "/":
                solution = r1.divide(r1);
                output += " = " + solution.toString();
                break;
            default:
                System.out.println("Illegal argument. Valid arguments: + - * /");
                return;
        }

        System.out.println(output);
    }
}

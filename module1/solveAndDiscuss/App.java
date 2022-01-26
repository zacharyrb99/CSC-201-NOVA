package module1.solveAndDiscuss;

/*
(Demonstrate cancellation errors) A cancellation error occurs when you are manipulating a very large number with a very small number.
The large number may cancel out the smaller number. For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0. 
To avoid cancellation errors and obtain more accurate results, carefully select the order of computation. For example, in computing the following
summation, you will obtain more accurate results by computing from right to left than left to right:
    1 + 1/2 + 1/3 + ... + 1/n

Write a program that compares the results of summation of the preceding series, computer from left to right and right to left with n=50000.
*/

public class App {
    public static void main(String[] args) {
        // left -> right
        double sumLR = 0.0;
        for (double i = 1.0; i <= 50000.0; i++) {
            sumLR += 1 / i;
        }

        // right -> left
        double sumRL = 0.0;
        for (double i = 50000.0; i >= 1.0; i--) {
            sumRL += 1 / i;
        }

        System.out.println("Summation of series left -> right: " + sumLR);
        System.out.println("Summation of series right -> left: " + sumRL);
        System.out.println("Compare L->R - R->L: " + (sumLR - sumRL));
    }
}
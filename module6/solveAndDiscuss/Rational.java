package module6.solveAndDiscuss;

public class Rational {
    // holds numerator and denominator
    private int[] r = new int[2];

    Rational(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        r[1] = Math.abs(denominator) / gcd;
    }

    // Find GCD (greatest common denominator) of both nums
    private static int gcd(int n, int d) {
        int num = Math.abs(n);
        int denom = Math.abs(d);
        int gcd = 1;

        for (int i = 1; i <= num && i <= denom; i++) {
            if (num % i == 0 && denom % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // Get Numerator
    public int getNumerator() {
        return r[0];
    }

    // Get Denominator
    public int getDenominator() {
        return r[1];
    }

    // Add rational numbers
    public Rational add(Rational secondVal) {
        int num = (r[0] * secondVal.getDenominator()) + (r[1] * secondVal.getNumerator());
        int denom = r[1] * secondVal.getDenominator();
        return new Rational(num, denom);
    }

    // Subtract rational numbers
    public Rational subtract(Rational secondVal) {
        int num = (r[0] * secondVal.getDenominator()) - (r[1] * secondVal.getNumerator());
        int denom = r[1] * secondVal.getDenominator();
        return new Rational(num, denom);
    }

    // Multiply rational numbers
    public Rational multiply(Rational secondVal) {
        int num = r[0] * secondVal.getNumerator();
        int denom = r[1] * secondVal.getDenominator();
        return new Rational(num, denom);
    }

    // Divide rational numbers
    public Rational divide(Rational secondVal) {
        int num = r[0] * secondVal.getDenominator();
        int denom = r[1] * secondVal.getNumerator();
        return new Rational(num, denom);
    }

    @Override
    public String toString() {
        if (r[1] == 1) {
            return r[0] + "";
        } else {
            return r[0] + "/" + r[1];
        }
    }
}

package module8.Mod8Prob1;

import java.io.Serializable;

public class Fraction implements Serializable {
    private int numerator;
    private int denominator;
    private static char slash;

    public Fraction() {
        super();
        slash ='/';
    }

    public Fraction(int numerator, int denominator) {
        super();
        slash = '/';
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public static char getSlash() {
		return slash;
	}

	public static void setSlash(char slash) {
		Fraction.slash = slash;
	}

    @Override
    public String toString() {
        return String.format("Fraction [numerator = %s, denominator = %s]", numerator, denominator);
    }
}

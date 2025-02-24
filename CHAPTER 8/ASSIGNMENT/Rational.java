
package Chapter_8.Assignment;


public class Rational {
     private int numerator;   // Numerator of the fraction
    private int denominator; // Denominator of the fraction

    // No-argument constructor with default values
    public Rational() {
        this.numerator = 0;
        this.denominator = 1; // Default to 0/1
    }

    // Constructor that initializes the fraction and reduces it
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        // Reduce the fraction
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        // Ensure the denominator is positive
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Method to calculate the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
    }

    // Static method to add two Rational numbers
    public static Rational add(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Static method to subtract two Rational numbers
    public static Rational subtract(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Static method to multiply two Rational numbers
    public static Rational multiply(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.numerator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Static method to divide two Rational numbers
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int newNumerator = r1.numerator * r2.denominator;
        int newDenominator = r1.denominator * r2.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    // Method to return a String representation of the Rational number in a/b format
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Method to return a String representation of the Rational number in floating-point format
    public String toFloatingPointString(int precision) {
        double value = (double) numerator / denominator;
        return String.format("%." + precision + "f", value);
    }
}


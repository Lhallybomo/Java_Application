
package Chapter_8.Assignment;


public class Complex {
    private double realPart;      // Real part of the complex number
    private double imaginaryPart;  // Imaginary part of the complex number

    // No-argument constructor with default values
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    // Constructor with parameters to initialize the complex number
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double newReal = this.realPart + other.realPart;
        double newImaginary = this.imaginaryPart + other.imaginaryPart;
        return new Complex(newReal, newImaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        double newReal = this.realPart - other.realPart;
        double newImaginary = this.imaginaryPart - other.imaginaryPart;
        return new Complex(newReal, newImaginary);
    }

    // Method to print the complex number in the form (realPart, imaginaryPart)
    @Override
    public String toString() {
        return String.format("(%f, %f)", realPart, imaginaryPart);
    }
}


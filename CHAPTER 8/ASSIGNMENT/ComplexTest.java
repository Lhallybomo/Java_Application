
package Chapter_8.Assignment;

public class ComplexTest {
     public static void main(String[] args) {
        // Create complex numbers using the parameterized constructor
        Complex complex1 = new Complex(3.0, 2.0); // 3 + 2i
        Complex complex2 = new Complex(1.0, 7.0); // 1 + 7i

        // Display the complex numbers
        System.out.println("Complex Number 1: " + complex1);
        System.out.println("Complex Number 2: " + complex2);

        // Add the two complex numbers
        Complex sum = complex1.add(complex2);
        System.out.println("Sum: " + sum); // (4.0, 9.0)

        // Subtract the two complex numbers
        Complex difference = complex1.subtract(complex2);
        System.out.println("Difference: " + difference); // (2.0, -5.0)

        // Test the no-argument constructor
        Complex defaultComplex = new Complex();
        System.out.println("Default Complex Number: " + defaultComplex); // (0.0, 0.0)
    }
}


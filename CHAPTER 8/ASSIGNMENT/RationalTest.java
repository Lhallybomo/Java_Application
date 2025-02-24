
package Chapter_8.Assignment;

public class RationalTest {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4); // 1/2
        Rational r2 = new Rational(3, 4); // 3/4

        System.out.println("Rational 1: " + r1);
        System.out.println("Rational 2: " + r2);

        Rational sum = Rational.add(r1, r2);
        System.out.println("Sum: " + sum);

        Rational difference = Rational.subtract(r1, r2);
        System.out.println("Difference: " + difference);

        Rational product = Rational.multiply(r1, r2);
        System.out.println("Product: " + product);

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("Quotient: " + quotient);

    }
}
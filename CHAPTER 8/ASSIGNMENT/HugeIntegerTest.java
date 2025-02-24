
package Chapter_8.Assignment;


public class HugeIntegerTest {
    public static void main(String[] args) {
        // Test Case 1: Parsing a HugeInteger
        HugeInteger num1 = new HugeInteger();
        num1.parse("1234567890123456789012345678901234567890");
        System.out.println("HugeInteger 1: " + num1); // Expected: 1234567890123456789012345678901234567890

        // Test Case 2: Parsing another HugeInteger
        HugeInteger num2 = new HugeInteger();
        num2.parse("9876543210987654321098765432109876543210");
        System.out.println("HugeInteger 2: " + num2); // Expected: 9876543210987654321098765432109876543210

        // Test Case 3: Addition of two HugeIntegers
        HugeInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum); // Expected: 11111111101111111110111111111011111111100

        // Test Case 4: Subtraction of two HugeIntegers
        HugeInteger difference = num2.subtract(num1);
        System.out.println("Difference: " + difference); // Expected: 8641975320864197532086419753208641975320

        // Test Case 5: Comparison - isEqualTo
        System.out.println("num1 is equal to num2: " + num1.isEqualTo(num2)); // Expected: false

        // Test Case 6: Comparison - isNotEqualTo
        System.out.println("num1 is not equal to num2: " + num1.isNotEqualTo(num2)); // Expected: true

        // Test Case 7: Comparison - isGreaterThan
        System.out.println("num1 is greater than num2: " + num1.isGreaterThan(num2)); // Expected: false

        // Test Case 8: Comparison - isLessThan
        System.out.println("num1 is less than num2: " + num1.isLessThan(num2)); // Expected: true

        // Test Case 9: Comparison - isGreaterThanOrEqualTo
        System.out.println("num1 is greater than or equal to num2: " + num1.isGreaterThanOrEqualTo(num2)); // Expected: false

        // Test Case 10: Comparison - isLessThanOrEqualTo
        System.out.println("num1 is less than or equal to num2: " + num1.isLessThanOrEqualTo(num2)); // Expected: true

        // Test Case 11: Testing isZero
        HugeInteger zero = new HugeInteger();
        System.out.println("Zero is zero: " + zero.isZero()); // Expected: true

        // Test Case 12: Testing addition with zero
        HugeInteger sumWithZero = num1.add(zero);
        System.out.println("Sum with zero: " + sumWithZero); // Expected: 1234567890123456789012345678901234567890

        // Test Case 13: Testing subtraction resulting in zero
        HugeInteger differenceWithZero = num1.subtract(num1);
        System.out.println("Difference with itself: " + differenceWithZero); // Expected: 0

        // Test Case 14: Testing large number addition
        HugeInteger largeNum1 = new HugeInteger();
        largeNum1.parse("9999999999999999999999999999999999999999");
        HugeInteger largeNum2 = new HugeInteger();
        largeNum2.parse("1");
        HugeInteger largeSum = largeNum1.add(largeNum2);
        System.out.println("Large Sum: " + largeSum); // Expected: 10000000000000000000000000000000000000000
    }
}

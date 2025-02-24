
package Chapter_8.Assignment;


public class HugeInteger {
    private final int[] digits; // Array to store digits
    private int size;     // Actual size of the number
    private boolean thi;

    // Constructor
    public HugeInteger() {
        digits = new int[40]; // 40-element array
        size = 0;
    }

    // Method to parse a string and fill the digits array
    public void parse(String number) {
        size = number.length();
        if (size > 40) {
            throw new IllegalArgumentException("Number exceeds 40 digits.");
        }
        for (int i = 0; i < size; i++) {
            digits[i] = Character.getNumericValue(number.charAt(i));
        }
    }

    // Method to return the string representation of the HugeInteger
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(digits[i]);
        }
        return result.toString();
    }

    // Method to add two HugeInteger objects
    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        int maxSize = Math.max(this.size, other.size);
        for (int i = 0; i < maxSize || carry != 0; i++) {
            int sum = carry;
            if (i < this.size) {
                sum += this.digits[this.size - 1 - i];
            }
            if (i < other.size) {
                sum += other.digits[other.size - 1 - i];
            }
            result.digits[result.size++] = sum % 10;
            carry = sum / 10;
        }
        // Reverse the result array
        for (int i = 0; i < result.size / 2; i++) {
            int temp = result.digits[i];
            result.digits[i] = result.digits[result.size - 1 - i];
            result.digits[result.size - 1 - i] = temp;
        }
        return result;
    }

    // Method to subtract two HugeInteger objects
    public HugeInteger subtract(HugeInteger other) {
        if (this.isLessThan(other)) {
            throw new IllegalArgumentException("Result would be negative.");
        }
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int i = 0; i < this.size; i++) {
            int sub = this.digits[this.size - 1 - i] - borrow;
            if (i < other.size) {
                sub -= other.digits[other.size - 1 - i];
            }
            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[result.size++] = sub;
        }
        // Remove leading zeros
        while (result.size > 1 && result.digits[result.size - 1] == 0) {
            result.size--;
        }
        // Reverse the result array
        for (int i = 0; i < result.size / 2; i++) {
            int temp = result.digits[i];
            result.digits[i] = result.digits[result.size - 1 - i];
            result.digits[result.size - 1 - i] = temp;
        }
        return result;
    }

    // Comparison methods

    /**
     *
     * @param other
     * @return
     */
    @SuppressWarnings("empty-statement")
    public boolean isEqualTo(HugeInteger other) {
        if (this.size != other.size) return false;
        for (int i = 0; i < this.size; i++) {
;
    }
    boolean isLessThan(HugeInteger other); {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    String isNotEqualTo(HugeInteger num2); {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    String isGreaterThan(HugeInteger num2) {;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String isGreaterThanOrEqualTo(HugeInteger num2) {;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String isLessThanOrEqualTo(HugeInteger num2) {;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String isZero() {;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}

    private boolean isLessThan(HugeInteger other) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}

    String isZero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}
}

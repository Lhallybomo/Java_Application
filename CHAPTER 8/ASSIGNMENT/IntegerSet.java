
package Chapter_8.Assignment;

// IntegerSet class to manage a set of integers
public class IntegerSet {
    private final boolean[] set; // Array to hold the set elements

    // No-argument constructor initializes the set to the empty set
    public IntegerSet() {
        set = new boolean[101]; // Initialize array for integers 0-100
    }

    // Static method to create the union of two sets
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] || set2.set[i];
        }
        return resultSet;
    }

    // Static method to create the intersection of two sets
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] && set2.set[i];
        }
        return resultSet;
    }

    // Method to insert an element into the set
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    // Method to delete an element from the set
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    // Method to return a string representation of the set
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                result.append(i).append(" ");
                isEmpty = false;
            }
        }
        return isEmpty ? "---" : result.toString().trim();
    }

    // Method to check if two sets are equal
    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i < set.length; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }
}


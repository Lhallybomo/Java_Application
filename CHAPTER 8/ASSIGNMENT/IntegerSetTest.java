
package Chapter_8.Assignment;

// Test program for IntegerSet class
public class IntegerSetTest {
     public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Inserting elements into set1
        set1.insertElement(1);
        set1.insertElement(2);
        set1.insertElement(3);
        System.out.println("Set 1: " + set1);

        // Inserting elements into set2
        set2.insertElement(2);
        set2.insertElement(3);
        set2.insertElement(4);
        System.out.println("Set 2: " + set2);

        // Testing union
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        // Testing intersection
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);

        // Testing deletion
        set1.deleteElement(2);
        System.out.println("Set 1 after deleting 2: " + set1);

        // Testing equality
        System.out.println("Set 1 is equal to Set 2: " + set1.isEqualTo(set2));
    }
}


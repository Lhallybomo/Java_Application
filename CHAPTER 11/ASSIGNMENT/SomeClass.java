
package Chapter_11.Assignment;


public class SomeClass {
    public SomeClass() throws Exception {
        throw new Exception("Constructor failure");
    }
    
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
 }
}
}


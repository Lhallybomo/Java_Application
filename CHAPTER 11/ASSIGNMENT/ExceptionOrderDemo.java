
package Chapter_11.Assignment;


public class ExceptionOrderDemo {
     public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (Exception e) { // This will cause a compile-time error if placed before the subclass catch
            System.out.println("Caught an Exception: " + e.getMessage());
        }
}
}
    

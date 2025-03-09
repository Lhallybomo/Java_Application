
package Chapter_11.Assignment;


public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            methodWithTryBlock();
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void methodWithTryBlock() {
        try { // This will throw ArithmeticException
            // This will throw ArithmeticException
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
}
}
}


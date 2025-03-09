
package Chapter_11.Assignment;


public class RethrowExceptionExample {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            throw e; // Rethrowing the exception
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("An error occurred in someMethod2");
}

}

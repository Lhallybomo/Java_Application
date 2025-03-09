
package Chapter_11.Assignment;

class ExceptionA extends Exception {
}
class ExceptionB extends ExceptionA {
}
class ExceptionC extends ExceptionB {
}


public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new ExceptionC();
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA or its subclasses.");
        }
}
}

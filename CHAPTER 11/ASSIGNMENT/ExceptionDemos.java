package Chapter_11.Assignment;

import java.io.IOException;

public class ExceptionDemos {

    public static void main(String[] args) {
        try {
            throw new ExceptionA();
        } catch (ExceptionA exception) {
            System.out.println("Caught ExceptionA: " + exception);
        }

        try {
            throw new ExceptionB();
        } catch (ExceptionB exception) {
            System.out.println("Caught ExceptionB: " + exception);
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException exception) {
            System.out.println("Caught NullPointerException: " + exception);
        }

        try {
            throw new IOException();
        } catch (IOException exception) {
            System.out.println("Caught IOException: " + exception);
        }
    }
}

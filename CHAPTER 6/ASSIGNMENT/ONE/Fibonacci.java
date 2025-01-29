import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part a: Calculate nth Fibonacci number using int
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int nthFibonacci = fibonacciInt(n);
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);

        // Part b: Determine largest Fibonacci number that can be displayed using int
        int maxN = findMaxNFibonacciInt();
        System.out.println("Largest Fibonacci number that can be displayed using int: " + maxN);

        // Part c: Calculate nth Fibonacci number using double
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        double nthFibonacciDouble = fibonacciDouble(n);
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacciDouble);

        // Part c: Determine largest Fibonacci number that can be displayed using double
        int maxNDouble = findMaxNFibonacciDouble();
        System.out.println("Largest Fibonacci number that can be displayed using double: " + maxNDouble);

        input.close();
    }

    // Part a: Calculate nth Fibonacci number using int
    public static int fibonacciInt(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciInt(n - 1) + fibonacciInt(n - 2);
        }
    }

    // Part b: Determine largest Fibonacci number that can be displayed using int
    public static int findMaxNFibonacciInt() {
        int n = 1;
        int prevFib = 0;
        int currFib = 1;

        while (currFib > prevFib) {
            int nextFib = prevFib + currFib;
            prevFib = currFib;
            currFib = nextFib;
            n++;
        }

        return n - 2; // Since the loop overshoots by 2 iterations
    }

    // Part c: Calculate nth Fibonacci number using double
    public static double fibonacciDouble(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciDouble(n - 1) + fibonacciDouble(n - 2);
        }
    }

    // Part c: Determine largest Fibonacci number that can be displayed using double
    public static int findMaxNFibonacciDouble() {
        int n = 1;
        double prevFib = 0;
        double currFib = 1;

        while (currFib > prevFib) {
            double nextFib = prevFib + currFib;
            prevFib = currFib;
            currFib = nextFib;
            n++;
        }

        return n - 2; // Since the loop overshoots by 2 iterations
    }
}
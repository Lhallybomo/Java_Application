public class SieveOfEratosthenes {

    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1000];

        // Initialize all elements to true
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i < Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Display prime numbers
        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
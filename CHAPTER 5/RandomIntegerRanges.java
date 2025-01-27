import java.util.Random;

public class RandomIntegerRanges {

    public static void main(String[] args) {
        Random rand = new Random();

        // a) 1 ≤ n ≤ 2
        int n = rand.nextInt(2) + 1; 
        System.out.println("a) n = " + n); 

        // b) 1 ≤ n ≤ 100
        n = rand.nextInt(100) + 1;
        System.out.println("b) n = " + n);

        // c) 0 ≤ n ≤ 9
        n = rand.nextInt(10); 
        System.out.println("c) n = " + n);

        // d) 1000 ≤ n ≤ 1112
        n = rand.nextInt(113) + 1000; 
        System.out.println("d) n = " + n);

        // e) -1 ≤ n ≤ 1
        n = rand.nextInt(3) - 1; 
        System.out.println("e) n = " + n);

        // f) -3 ≤ n ≤ 11
        n = rand.nextInt(15) - 3; 
        System.out.println("f) n = " + n); 
    }
}
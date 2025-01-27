import java.util.Random;

public class RandomNumberSelection {

    public static void main(String[] args) {
        Random rand = new Random();

        // a) 2, 4, 6, 8, 10
        int[] setA = {2, 4, 6, 8, 10};
        int randomIndexA = rand.nextInt(setA.length); 
        int randomValueA = setA[randomIndexA];
        System.out.println("Random number from set A: " + randomValueA);

        // b) 3, 5, 7, 9, 11
        int[] setB = {3, 5, 7, 9, 11};
        int randomIndexB = rand.nextInt(setB.length);
        int randomValueB = setB[randomIndexB];
        System.out.println("Random number from set B: " + randomValueB);

        // c) 6, 10, 14, 18, 22
        int[] setC = {6, 10, 14, 18, 22};
        int randomIndexC = rand.nextInt(setC.length);
        int randomValueC = setC[randomIndexC];
        System.out.println("Random number from set C: " + randomValueC);
    }
}
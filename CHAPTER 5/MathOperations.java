public class MathOperations {

    public static void main(String[] args) {
        double x; 

        // a) x = Math.abs(7.5);
        x = Math.abs(7.5); 
        System.out.println("a) x = " + x); // Output: a) x = 7.5

        // b) x = Math.floor(7.5);
        x = Math.floor(7.5); 
        System.out.println("b) x = " + x); // Output: b) x = 7.0

        // c) x = Math.abs(0.0);
        x = Math.abs(0.0); 
        System.out.println("c) x = " + x); // Output: c) x = 0.0

        // d) x = Math.ceil(0.0);
        x = Math.ceil(0.0); 
        System.out.println("d) x = " + x); // Output: d) x = 0.0

        // e) x = Math.abs(-6.4);
        x = Math.abs(-6.4); 
        System.out.println("e) x = " + x); // Output: e) x = 6.4

        // f) x = Math.ceil(-6.4);
        x = Math.ceil(-6.4); 
        System.out.println("f) x = " + x); // Output: f) x = -6.0

        // g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))); 
        System.out.println("g) x = " + x); // Output: g) x = -14.0 
    }
}
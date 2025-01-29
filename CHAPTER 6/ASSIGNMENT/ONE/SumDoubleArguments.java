public class SumDoubleArguments {

    public static void main(String[] args) {
        double sum = 0.0;

        // Use enhanced for loop to iterate through command-line arguments
        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                System.err.println("Invalid argument: " + arg + ". Ignoring.");
            }
        }

        System.out.println("Sum of double values: " + sum);
    }
}
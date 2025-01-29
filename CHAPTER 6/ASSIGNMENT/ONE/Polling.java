import java.util.Scanner;

public class Polling {

    public static void main(String[] args) {
        String[] topics = {
                "Environmental Protection",
                "Education Reform",
                "Healthcare Reform",
                "Poverty Reduction",
                "Social Justice"
        };

        int[][] responses = new int[5][10]; // 5 topics, 10 ratings

        Scanner input = new Scanner(System.in);

        // Collect responses from users
        while (true) {
            System.out.println("Enter 1 to rate, 0 to quit:");
            int choice = input.nextInt();
            if (choice == 0) {
                break;
            }

            for (int i = 0; i < topics.length; i++) {
                System.out.println("Rate " + topics[i] + " (1-10):");
                int rating = input.nextInt();
                if (rating >= 1 && rating <= 10) {
                    responses[i][rating - 1]++; // Adjust for 0-based array index
                } else {
                    System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                    i--; // Re-prompt the user for the same topic
                }
            }
        }

        // Display tabular report
        System.out.println("\nSummary of Responses:");
        System.out.print("\t");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("Average");

        double[] averages = new double[5];
        for (int i = 0; i < topics.length; i++) {
            System.out.print(topics[i] + "\t");
            int total = 0;
            for (int j = 0; j < 10; j++) {
                System.out.print(responses[i][j] + "\t");
                total += responses[i][j] * (j + 1); // Calculate weighted sum
            }

            int totalResponses = 0;
            for (int j = 0; j < 10; j++) {
                totalResponses += responses[i][j];
            }

            if (totalResponses > 0) {
                averages[i] = (double) total / totalResponses;
            } else {
                averages[i] = 0; // Handle case with no responses
            }

            System.out.printf("%.2f\n", averages[i]);
        }

        // Find issue with highest and lowest point total
        int highestIndex = 0;
        int lowestIndex = 0;
        for (int i = 1; i < topics.length; i++) {
            if (averages[i] > averages[highestIndex]) {
                highestIndex = i;
            }
            if (averages[i] < averages[lowestIndex]) {
                lowestIndex = i;
            }
        }

        System.out.println("\nIssue with highest point total: " + topics[highestIndex] + " (Average: " + averages[highestIndex] + ")");
        System.out.println("Issue with lowest point total: " + topics[lowestIndex] + " (Average: " + averages[lowestIndex] + ")");

        input.close();
    }
}
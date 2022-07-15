import java.util.Scanner;

class d {
    public static void main(String[] args) {

        // Write For Loop from Do While Loop in the previous code challenge.
        int maxTimes = 10;
        Scanner scanner = new Scanner(System.in);
        int userInput;

        for (int count = 0; count < maxTimes; count++) {

            // Ask user to provide input based on question.
            System.out.println("How many times has this printed?");
        }

        // Get user input
        userInput = scanner.nextInt();

        // Test answer
        if (userInput == maxTimes) {
            System.out.println("Correct. This will print " + userInput + " times.");
        } else {
            System.out.println("Not correct. Check your max times.");
        }

        scanner.close();
    }
}

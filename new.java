import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 5; // Number of guesses allowed
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100. You have " + attempts + " attempts.");

        // Loop through the attempts
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasWon = true;
                break;
            }
        }

        // End of game
        if (hasWon) {
            System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
        } else {
            System.out.println("Sorry, you've used all attempts. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}

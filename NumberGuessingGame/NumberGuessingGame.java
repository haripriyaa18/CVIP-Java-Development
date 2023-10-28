import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;  // Minimum number in the range
        int maxRange = 100;  // Maximum number in the range
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange);

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + numberOfGuesses + " guesses.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }
}
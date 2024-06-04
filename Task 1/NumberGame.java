package Task1;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;


        System.out.println("--------------- Number Game ---------------");
        System.out.println("You have 10 attempts to guess the number");
        System.out.println("Guess a number between 1 and 100: ");

        boolean guessedCorrectly = false;
        int numberOfAttempts = 0;
        while (!guessedCorrectly && numberOfAttempts < 10) {
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                guessedCorrectly = true;
            } else {
                numberOfAttempts++;
                if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }
        }
        scanner.close();
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed correctly! The number was " + randomNumber);
        } else {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNumber);
        }
    }
}
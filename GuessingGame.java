import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();

       //number of tries allowed
        int maxTries = 5;

        // Keep playing until you say no
        while (true) {
            //any secret number (user don't know)
            int secretNumber = random.nextInt(100) + 1;

            //number of tries user has used
            int tries = 0;
            boolean guessedIt = false; // Did you guess the secret number?

            //keep on going until the guess is right or until the number of tries are finished
            while (tries < maxTries && !guessedIt) {
                System.out.println("Guess a number between 1 and 100 (Try " + (tries + 1) + ")");
                int guess = scanner.nextInt();

                //checking if the guessed number is correct or not.
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + (tries + 1) + " tries.");
                    guessedIt = true; // You got it!
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
                tries++;
            }

            // asking if you want to play another round
            if (guessedIt) { // correct guess
                System.out.println("Play again? (yes/no)");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("no")) {
                    break;
                }
            } else { //number of tries are finished
                System.out.println("You ran out of tries. The secret number was: " + secretNumber);
            }
        }

        System.out.println("Thanks for playing!");
    }
}

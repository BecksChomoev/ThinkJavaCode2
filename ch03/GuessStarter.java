import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int userGuess;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number ");
        userGuess = scanner.nextInt();

        System.out.println("Your guess is: " + userGuess);
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + (number - userGuess));
    }

}

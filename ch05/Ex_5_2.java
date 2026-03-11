import java.util.Random;
import java.util.Scanner;

public class Ex_5_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int userGuess;
        int userAttempts = 3;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");

        Scanner scanner = new Scanner(System.in);

        while(userAttempts != 0 ) {
            System.out.print("Type a number ");
            userGuess = scanner.nextInt();

            if (userGuess < number) {
                System.out.println("Your number is less than the number I'm thinking about");
                userAttempts--;
            } else if (userGuess > number) {
                System.out.println("Your number is bigger than the number I'm thinking about");
                userAttempts--;
            } else {
                System.out.println("Congratulations! You guessed right!");
                break;
            }

            if (userAttempts == 0) {
                System.out.println("I'm sorry you are out of attempts");
                System.out.println("The number I was thinking of is: " + number);
            }
        }
    }
}

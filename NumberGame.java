import java.util.Random;
import java.util.Scanner;

class NumberGame {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();

      String playAgain = "Yes";

      while (playAgain.equalsIgnoreCase("Yes")) {
         // Generate a random number between 1 and 100
         int randomNumber = random.nextInt(100) + 1; // Adding 1 to include 100
         System.out.print("Enter the attempt limit number: ");
         int limitNum = input.nextInt();

         int numberOfAttempts;
         for (numberOfAttempts = 1; numberOfAttempts <= limitNum; numberOfAttempts++) {
            System.out.print("Please enter your guess (1-100): ");
            int guess = input.nextInt();

            if (guess < 1 || guess > 100) {
               System.out.println("Invalid guess! The number must be between 1 and 100.");
               continue;
            }

            if (guess == randomNumber) {
               System.out.println("Congratulations! You guessed the correct number.");
               break;
            }

            if (guess < randomNumber) {
               System.out.println("Your guess is too low.");
            } else {
               System.out.println("Your guess is too high.");
            }
         }

         if (numberOfAttempts > limitNum) {
            System.out.println("Game over! You've reached the maximum number of attempts.");
            System.out.println("The correct number was: " + randomNumber);
         }

         System.out.print("Do you want to play again? (Yes/No): ");
         playAgain = input.next();
      }

      System.out.println("Goodbye, have a nice day!");
      input.close();
   }
}

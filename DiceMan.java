// DiceMan.java
import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("🎲 Welcome to the Dice Man Game!");
        System.out.println("You will guess the sum of two dice (from 2 to 12).");

        while (playAgain) {
            System.out.print("\nEnter your guess (2–12): ");
            int guess = input.nextInt();

            // Düzgün aralıq yoxlanır
            if (guess < 2 || guess > 12) {
                System.out.println("Invalid guess! Please enter a number between 2 and 12.");
                continue;
            }

            // İki ədəd 6-tərəfli zərin atılması
            int die1 = (int)(Math.random() * 6) + 1;
            int die2 = (int)(Math.random() * 6) + 1;
            int sum = die1 + die2;

            System.out.println("Dice rolled: " + die1 + " and " + die2 + " (Sum = " + sum + ")");

            if (sum == guess) {
                System.out.println("🎉 You WIN!");
            } else {
                System.out.println("💻 Computer wins!");
            }

            // Yeni raund üçün sorğu
            System.out.print("Do you want to play again? (yes/no): ");
            String answer = input.next().toLowerCase();
            playAgain = answer.equals("yes");
        }

        System.out.println("\nThanks for playing Dice Man! 👋");
    }
}

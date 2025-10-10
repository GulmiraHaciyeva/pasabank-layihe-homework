// CoinTossing.java
import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of tosses: ");
        int n = input.nextInt();

        // Əgər istifadəçi sıfır və ya mənfi ədəd daxil edərsə
        if (n <= 0) {
            System.out.println("Error: Number of tosses must be positive!");
            return;
        }

        int heads = 0;
        int tails = 0;

        // Sikkəni n dəfə atırıq
        for (int i = 0; i < n; i++) {
            double toss = Math.random(); // 0.0 ≤ toss < 1.0
            if (toss < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        // Ehtimalların hesablanması
        double headProbability = (double) heads / n;
        double tailProbability = (double) tails / n;

        // Nəticələrin göstərilməsi
        System.out.println("Number of tosses: " + n);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.printf("Probability of Heads = %.2f\n", headProbability);
        System.out.printf("Probability of Tails = %.2f\n", tailProbability);
    }
}

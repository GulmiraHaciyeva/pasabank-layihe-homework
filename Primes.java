// Primes.java
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;

            // 2-dən başlayıb num-un kvadrat kökünə qədər yoxlayırıq
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}


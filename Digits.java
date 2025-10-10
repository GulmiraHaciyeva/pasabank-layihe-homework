// Digits.java
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (can be negative): ");
        int number = input.nextInt();

        // Mənfi ədədin müsbət hissəsini götürürük
        number = Math.abs(number);

        // Əgər istifadəçi 0 daxil edibsə, xüsusi hal kimi baxırıq
        if (number == 0) {
            System.out.println("Sum = 0");
            System.out.println("Product = 0");
            System.out.println("Average = 0");
            return;
        }

        int sum = 0;
        int product = 1;
        int count = 0;
        int temp = number;

        // Rəqəmləri ayırırıq və hesablamaları edirik
        while (temp > 0) {
            int digit = temp % 10;  // son rəqəmi tapırıq
            sum += digit;           // cəmi artırırıq
            product *= digit;       // hasili vururuq
            count++;                // rəqəmlərin sayını sayırıq
            temp /= 10;             // son rəqəmi silirik
        }

        double average = (double) sum / count;

        System.out.println("Sum of digits = " + sum);
        System.out.println("Product of digits = " + product);
        System.out.println("Average of digits = " + average);
    }
}

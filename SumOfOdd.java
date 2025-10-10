// SumOfOdd.java
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // İki ədədin daxil edilməsi
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Əgər sıralama düzgün deyilsə, dəyişdiririk
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        int sum = 0;

        // Aralıqdakı tək ədədləri tapıb cəmini hesablayırıq
        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers between " + start + " and " + end + " is: " + sum);
    }
}

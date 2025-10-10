// MinMax.java
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double min = null;
        Double max = null;

        System.out.println("Enter floating-point numbers (press Ctrl + Z on Windows or Ctrl + D on Mac/Linux to finish):");

        while (input.hasNextDouble()) {
            double num = input.nextDouble();

            if (min == null || num < min) {
                min = num;
            }
            if (max == null || num > max) {
                max = num;
            }
        }

        if (min == null || max == null) {
            System.out.println("Error: No numbers entered!");
        } else {
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
        }
    }
}


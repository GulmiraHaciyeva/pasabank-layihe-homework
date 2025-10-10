// Average.java
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        System.out.println("Enter numbers (press Ctrl + Z on Windows or Ctrl + D on Mac/Linux to finish):");

        // İstifadəçi EOF (End Of File) verənə qədər oxuyur
        while (input.hasNextDouble()) {
            double num = input.nextDouble();
            sum += num;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No input entered!");
        } else {
            double average = sum / count;
            System.out.println("Average = " + average);
        }
    }
}

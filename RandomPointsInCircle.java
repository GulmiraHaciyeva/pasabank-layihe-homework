// RandomPointsInCircle.java
import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of random points to generate: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Error: Number of points must be positive!");
            return;
        }

        for (int i = 0; i < n; i++) {
            // Təsadüfi radius və bucaq (uniform paylanma üçün sqrt istifadə olunur)
            double r = Math.sqrt(Math.random()); // radius 0–1 arası, uniform paylanma üçün sqrt
            double theta = 2 * Math.PI * Math.random(); // 0–2π arası bucaq

            // Kartesian koordinatlara keçid
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);

            System.out.printf("Point %d: (%.4f, %.4f)\n", i + 1, x, y);
        }
    }
}


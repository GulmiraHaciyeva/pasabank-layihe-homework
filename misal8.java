import java.util.Scanner;

public class misal8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci tam ededi daxil edin: ");
        int num1 = input.nextInt();

        System.out.print("İkinci tam ededi daxil edin: ");
        int num2 = input.nextInt();

        int sum = num1 + num2; // toplama
        int diff = num1 - num2; // çıxma
        int prod = num1 * num2; // vurma
        int mod = num1 % num2; // qalıq
        double div = (double) num1 / num2; // bölmə

        System.out.println("\nRiyazi emeliyyatlarin neticəleri:");
        System.out.printf("%d + %d = %d%n", num1, num2, sum);
        System.out.printf("%d - %d = %d%n", num1, num2, diff);
        System.out.printf("%d * %d = %d%n", num1, num2, prod);
        System.out.printf("%d / %d = %.2f%n", num1, num2, div);
        System.out.printf("%d %% %d = %d%n", num1, num2, mod);

        input.close();
    }
}

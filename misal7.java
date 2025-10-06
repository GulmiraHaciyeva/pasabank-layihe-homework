import java.util.Scanner;

public class misal7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci tam ededi daxil edin: ");
        int num1 = input.nextInt();

        System.out.print("İkinci tam ededi daxil edin: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("ededlerin cemi: " + sum);

        input.close();
    }
}

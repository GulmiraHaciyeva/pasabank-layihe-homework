import java.util.Scanner;

public class misal11 {
    public static void main(String[] args) {

        int month;

        Scanner input = new Scanner(System.in);
        System.out.print("Ayin nomresini daxil edin (1-12): ");
        month = input.nextInt();
        input.close();

        switch (month) {
            case 1:
                System.out.println("Yanvar (January) 31 gun");
                break;
            case 2:
                System.out.println("Fevral (February) 28 gun"); // Leap year nəzərə alınmayıb
                break;
            case 3:
                System.out.println("Mart (March) 31 gun");
                break;
            case 4:
                System.out.println("Aprel (April) 30 gun");
                break;
            case 5:
                System.out.println("May31 gun");
                break;
            case 6:
                System.out.println("iyun (June) 30 gun");
                break;
            case 7:
                System.out.println("iyul (July) 31 gun");
                break;
            case 8:
                System.out.println("Avqust (August) 31 gun");
                break;
            case 9:
                System.out.println("Sentyabr (September) 30 gun");
                break;
            case 10:
                System.out.println("Oktyabr (October) s 31 gun");
                break;
            case 11:
                System.out.println("Noyabr (November) s 30 gun");
                break;
            case 12:
                System.out.println("Dekabr (December) s 31 gun");
                break;
            default:
                System.out.println("Yanliş ay nömrəsi daxil etdiniz! (1-12 olmalidir)");
        }
    }
}

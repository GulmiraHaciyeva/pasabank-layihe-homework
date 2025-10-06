import java.util.Scanner;

public class misal10 {
    public static void main(String[] args) {

        double num;
        if (args.length == 0) {
           
            Scanner input = new Scanner(System.in);
            System.out.print("Bir eded daxil edin: ");
            num = input.nextDouble();
            input.close();
        } else {
            
            num = Double.parseDouble(args[0]);
        }

       
        if (num > 0) {
            System.out.println(num + " musbet ededdir (positive).");
        } else if (num < 0) {
            System.out.println(num + " menfi ededdir (negative).");
        } else {
            System.out.println("eded 0-dir (neutral).");
        }
    }
}

import java.util.Scanner;

public class misal9 {
    public static void main(String[] args) {

        int totalSeconds;

        if (args.length == 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("saniyyeni daxil edin: ");
            totalSeconds = input.nextInt();
            input.close();
        } else {
            
            totalSeconds = Integer.parseInt(args[0]);
        }

    
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        
        System.out.printf("%d saniye = %d saat %d deqiqe %d saniyye%n", totalSeconds, hours, minutes, seconds);
    }
}

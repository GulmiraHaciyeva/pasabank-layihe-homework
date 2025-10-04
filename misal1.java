import java.util.Scanner;

public class misal1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Adinizi daxil edin: ");
        String name = input.nextLine(); 

        System.out.println("Salam, " + name + "!");
        System.out.println("Menim tam adim: Pasa Bankin robotu");

        input.close(); 
    }
}

public class misal6 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Zehmet olmasa iki tam eded daxil edin!");
            System.out.println("istifade qaydasi: java misal6 5 10");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("ededlerin cemi: " + (num1 + num2));
    }
}

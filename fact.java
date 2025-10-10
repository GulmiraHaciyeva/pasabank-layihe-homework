
public class fact {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Xeta: Zehmet olmasa bir tam eded daxil edin.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (number < 0) {
                System.out.println("Xeta: Menfi ededlerin faktoriali hesablanmir.");
                return;
            }

            long result = factorial(number);
            System.out.println(number + " ededinin faktoriali: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Xəta: Zehmet olmasa duzgun tam eded daxil edin.");
        }
    }
}

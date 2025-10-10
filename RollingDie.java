// RollingDie.java
public class RollingDie {
    public static void main(String[] args) {
        double rand = Math.random(); // 0.0 ≤ rand < 1.0
        int result;

        if (rand < 1.0 / 8) {
            result = 1;
        } else if (rand < 2.0 / 8) {
            result = 2;
        } else if (rand < 3.0 / 8) {
            result = 3;
        } else if (rand < 4.0 / 8) {
            result = 4;
        } else if (rand < 6.0 / 8) { // 5 və 6-nın ehtimalı 1/4 + 1/4 = 2/8
            result = 5;
        } else {
            result = 6;
        }

        System.out.println("The die shows: " + result);
    }
}

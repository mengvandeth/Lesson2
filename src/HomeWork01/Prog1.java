package HomeWork01;

import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt(1,10);
        System.out.printf("X is = %d%n", x);
        System.out.printf("PI power X = %.2f%n", Math.pow(Math.PI,x));
        int y = rd.nextInt(3,15);
        System.out.printf("Y is = %d%n", y);
        System.out.printf("Y power PI = %.2f%n", Math.pow(y,Math.PI));
        System.out.println("hello");
    }
}

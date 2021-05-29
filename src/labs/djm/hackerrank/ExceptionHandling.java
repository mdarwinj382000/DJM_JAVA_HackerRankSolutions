package labs.djm.hackerrank;

import java.util.Scanner;

class Calculator {
    public static long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

class ExceptionHandling {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            try {
            int a = s.nextInt();
            int b = s.nextInt();
                System.out.println(Calculator.power(a, b));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
//10 0
//        0 10
//        -1 4
//        2 -3
//        -2 -2
//        5 6
//        3 3
//        8 0
//        2 3
//        3 -3
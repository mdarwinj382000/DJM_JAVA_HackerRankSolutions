package labs.djm.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Biginteger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        java.math.BigInteger a=new java.math.BigInteger(A);
        java.math.BigInteger b=new java.math.BigInteger(B);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

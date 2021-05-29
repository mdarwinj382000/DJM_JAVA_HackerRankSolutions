package labs.djm.hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class Bitset {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(n);
        for(int i=0;i<m;i++){
            String opt=s.next();
            int x=s.nextInt();
            int y=s.nextInt();
            BitSet temp=((x==1)?b1:b2);
            BitSet temp1=((x==1)?b2:b1);
            switch (opt) {
                case "AND" -> {
                    temp.and(temp1);
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                }
                case "OR" -> {
                    temp.or(temp1);
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                }
                case "XOR" -> {
                    temp.xor(temp1);
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                }
                case "FLIP" -> {
                    temp.flip(y);
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                }
                case "SET" -> {
                    temp.set(y);
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                }
            }
        }
    }
}

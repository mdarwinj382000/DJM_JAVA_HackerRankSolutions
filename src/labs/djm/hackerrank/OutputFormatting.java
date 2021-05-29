package labs.djm.hackerrank;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str =new String[7];
        int[] x =new int[7];
        String[] s =new String[7];
        for(int i=0;i<3;i++){
            str[i]=sc.next();
            x[i]=sc.nextInt();
            s[i]=String.format("%03d",x[i]);
        }
        System.out.println("================================");
        for(int i=0;i<3;i++){
            System.out.printf("%-13s  %-13s%n",str[i],s[i]);
        }
        System.out.println("================================");
    }
}

package labs.djm.hackerrank;

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] a =new int[t];
        int[] b =new int[t];
        int[] n =new int[t];
        for(int i=0;i<t;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
        }
        for(int i=0;i<t;i++){
            for(int j=0;j<n[i];j++){
                int sum=a[i];
                for(int k=0;k<=j;k++){
                    sum+=(Math.pow(2,k)*b[i]);
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

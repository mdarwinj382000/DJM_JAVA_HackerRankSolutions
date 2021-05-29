package labs.djm.hackerrank;

import java.util.Scanner;

public class _2DArray {
    public static void main(String[] args) {
        int[][] arr =new int[6][6];
        int max=Integer.MIN_VALUE;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=s.nextInt();
                if(i>1&&j>1){
                    int sum=arr[i][j]+
                            arr[i][j-1]+
                            arr[i][j-2]+
                            arr[i-1][j-1]+
                            arr[i-2][j]+
                            arr[i-2][j-1]+
                            arr[i-2][j-2];
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

package labs.djm.hackerrank;

import java.util.Scanner;

public class StaticIntializerBlock {
    static int B,H;
    static boolean flag;
    static{
        Scanner s=new Scanner(System.in);
        B=s.nextInt();
        H=s.nextInt();
        if(B>0&&H>0){flag=true;}
        else{
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}

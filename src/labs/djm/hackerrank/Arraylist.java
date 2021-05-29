package labs.djm.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<java.util.ArrayList<Integer>> arr=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int len=s.nextInt();
            java.util.ArrayList<Integer> temp=new java.util.ArrayList<>();
            for(int j=0;j<len;j++){
                int ele=s.nextInt();
                temp.add(ele);
            }
            arr.add(temp);
        }
        n=s.nextInt();
        for(int i=0;i<n;i++){
            int q1=s.nextInt();
            q1--;
            int q2=s.nextInt();
            q2--;
            if(q1<arr.size()&&q2<arr.get(q1).size())
                System.out.println(arr.get(q1).get(q2));
            else
                System.out.println("ERROR!");
        }
    }
}

package labs.djm.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        List<Integer> arr=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int ele=s.nextInt();
            arr.add(ele);
        }
        n=s.nextInt();
        for(int i=0;i<n;i++){
            String ch=s.next();
            int x;
            switch (ch) {
                case "Insert" -> {
                    x = s.nextInt();
                    int y = s.nextInt();
                    arr.add(x, y);
                }
                case "Delete" -> {
                    x = s.nextInt();
                    arr.remove(x);
                }
            }
        }
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}

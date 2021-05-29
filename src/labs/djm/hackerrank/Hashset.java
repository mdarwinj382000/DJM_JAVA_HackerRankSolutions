package labs.djm.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Set<String> str=new HashSet<>();
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++){
            String temp=s.nextLine();
            str.add(temp);
            System.out.println(str.size());
        }
    }
}

package labs.djm.hackerrank;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.replaceAll("[^a-zA-Z0-9]"," ");
        s=s.replaceAll("\\s+"," ");
        s=s.trim();
        // System.out.println(s);
        int size=s.length();
        //System.out.println(size);
        String[] str =s.split("\\s");
        if(str.length==1){
            if(size==0)
            {
                System.out.println(size);
            }
            else{
                System.out.println(str.length);
            }
        }
        else{
            System.out.println(str.length);
        }
        for (String value : str) {
            if (!value.contains(" ")) {
                System.out.println(value);
            }
        }
        scan.close();
    }
}

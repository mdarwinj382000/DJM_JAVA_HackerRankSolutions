package labs.djm.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        java.util.Map<String,Integer> arr=new HashMap<>();
        int n=s.nextInt();
        s.nextLine();
        String str;
        for(int i=0;i<n;i++){
            str=s.nextLine();
            int phone=s.nextInt();
            s.nextLine();
            arr.put(str,phone);
        }
        while(s.hasNext()){
            str=s.nextLine().trim();
            if(arr.containsKey(str)){
                System.out.println(str+"="+arr.get(str));
            }else{
                System.out.println("Not found");
            }
        }
    }
}

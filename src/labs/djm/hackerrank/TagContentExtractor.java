package labs.djm.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size= Integer.parseInt(s.nextLine());
        while(size-->0){
            String str=s.nextLine();
            String pattern="<(.+)>([^<]+)</\\1>";
            Pattern p=Pattern.compile(pattern);
            boolean matched=false;
            Matcher m=p.matcher(str);
            while(m.find()){
                System.out.println(m.group(2));
                matched=true;
            }
            if(!matched)System.out.println("None");
        }
    }
}

package labs.djm.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

class student{}
class Rockstar{}
class Hacker{}
class InstanceOfKeyword {
    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for (Object element : mylist) {
            if (element instanceof student)
            a++;
            if (element instanceof Rockstar)
            b++;
            if (element instanceof Hacker)
            c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("student"))mylist.add(new student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}

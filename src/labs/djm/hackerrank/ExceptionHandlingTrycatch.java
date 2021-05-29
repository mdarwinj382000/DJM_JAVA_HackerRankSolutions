package labs.djm.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTrycatch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
          int a=s.nextInt();
          int b=s.nextInt();
          System.out.println(a/b);
        } catch(ArithmeticException ignored){
            System.out.println(ignored);
        } catch(InputMismatchException ignored){
            System.out.println(ignored.getClass().getName());
        }
    }
}

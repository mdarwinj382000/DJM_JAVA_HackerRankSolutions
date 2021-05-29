package labs.djm.hackerrank;

import java.util.Scanner;

class Add {
    public static void add(int... n) {
        int sum = 0;
        String Seperater = "";
        for (int i : n) {
            sum += i;
            System.out.print(Seperater + i);
            Seperater = "+";
        }
        System.out.println("=" + sum);
    }
}

public class Varargs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr =new int[6];
        for(int i=0;i<6;i++) {
            arr[i] = s.nextInt();
        }
        Add.add(arr[0],arr[1]);
        Add.add(arr[0],arr[1],arr[2]);
        Add.add(arr[0],arr[1],arr[2],arr[3],arr[4]);
        Add.add(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
    }
}

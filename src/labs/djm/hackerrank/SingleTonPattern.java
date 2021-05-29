package labs.djm.hackerrank;

import java.util.Scanner;

class Singleton {
    public static String str;

    private Singleton(String str) {
        System.out.println("Hello I am a singleton! Let me say " + str + " to you");
    }

    static void getSingleInstance(String str) {
        new Singleton(str);
    }
}

public class SingleTonPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Singleton.getSingleInstance(s.nextLine());
    }

}

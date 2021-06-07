package labs.djm.hackerrank;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] message = md.digest(str.getBytes());
        BigInteger no = new BigInteger(1, message);
        StringBuilder hashtext = new StringBuilder(no.toString(16));
        while (hashtext.length() < 32) {
            hashtext.insert(0, "0");
        }
        System.out.println(hashtext);
    }
}

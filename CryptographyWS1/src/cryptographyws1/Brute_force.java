/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyws1;

/**
 *
 * @author wl2-lam
 */
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Brute_force {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        boolean b = false;
        String[] c = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String c1 : c) {
            String test1 = SHA1(c1);
            if (test1.equals(s)) {
                System.out.println("The password is " + c1);
                b = true;
                break;
            } else {
                for (String c2 : c) {
                    String test2 = SHA1(c1 + c2);
                    if (test2.equals(s)) {
                        System.out.println("The password is " + c1 + c2);
                        b = true;
                        break;
                    } else {
                        for (String c3 : c) {
                            String test3 = SHA1(c1 + c2 + c3);
                            if (test3.equals(s)) {
                                System.out.println("The password is " + c1 + c2 + c3);
                                b = true;
                                break;
                            } else {
                                for (String c4 : c) {
                                    String test4 = SHA1(c1 + c2 + c3 + c4);
                                    if (test4.equals(s)) {
                                        System.out.println("The password is " + c1 + c2 + c3 + c4);
                                        b=true;
                                        break;
                                    } else {
                                        for (String c5 : c) {
                                            String test5 = SHA1(c1 + c2 + c3 + c4 + c5);
                                            if (test5.equals(s)) {
                                                System.out.println("The password is " + c1 + c2 + c3 + c4 + c5);
                                                b=true;
                                                break;
                                            } else {
                                                for (String c6 : c) {
                                                    String test6 = SHA1(c1 + c2 + c3 + c4 + c5 + c6);
                                                    if (test6.equals(s)) {
                                                        System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6);
                                                        b=true;
                                                        break;
//                                                    
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (b==false) {
            System.out.println("cant find solution");
        }
    }

    private static String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }

    public static String SHA1(String text)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md;
        md = MessageDigest.getInstance("SHA-1");
        byte[] sha1hash = new byte[40];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        sha1hash = md.digest();
        return convertToHex(sha1hash);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyws1;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author wl2-lam
 */
public class BCH_Brute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("please enter passsword");
        String s = "";
        BCH_Brute w = new BCH_Brute();
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        boolean b = false;
        String[] c = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (String c1 : c) {
            String test1 = c1;
            b = w.check(test1);
            if (b == false) {
                break;
            }
            test1 = SHA1(c1);
            if (test1.equals(s)) {
                System.out.println("The password is " + c1);
                b = true;
                break;
            } else {
                for (String c2 : c) {
                    String test2 = c1 + c2;
                    b = w.check(test2);
                    if (b == false) {
                        break;
                    }
                    test2 = SHA1(c1 + c2);
                    if (test2.equals(s)) {
                        System.out.println("The password is " + c1 + c2);

                        b = true;
                        break;
                    } else {
                        for (String c3 : c) {
                            String test3 = c1 + c2 + c3;
                            b = w.check(test1);
                            if (b == false) {
                                break;
                            }
                            test3 = SHA1(c1 + c2 + c3);
                            if (test3.equals(s)) {
                                System.out.println("The password is " + c1 + c2 + c3);

                                b = true;
                                break;
                            } else {
                                for (String c4 : c) {
                                    String test4 = c1 + c2 + c3 + c4;
                                    b = w.check(test4);
                                    if (b == false) {
                                        break;
                                    }
                                    test4 = SHA1(c1 + c2 + c3 + c4);
                                    if (test4.equals(s)) {
                                        System.out.println("The password is " + c1 + c2 + c3 + c4);
                                        b = true;
                                        break;
                                    } else {
                                        for (String c5 : c) {
                                            String test5 = c1 + c2 + c3 + c4 + c5;
                                            b = w.check(test5);
                                            if (b == false) {
                                                break;
                                            }
                                            test5 = SHA1(c1 + c2 + c3 + c4 + c5);
                                            if (test5.equals(s)) {
                                                System.out.println("The password is " + c1 + c2 + c3 + c4 + c5);
                                                b = true;
                                                break;
                                            } else {
                                                for (String c6 : c) {
                                                    String test6 = c1 + c2 + c3 + c4 + c5 + c6;
                                                    b = w.check(test6);
                                                    if (b == false) {
                                                        break;
                                                    }
                                                    test6 = SHA1(c1 + c2 + c3 + c4 + c5 + c6);
                                                    if (test6.equals(s)) {
                                                        System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6);
                                                        b = true;
                                                        break;
//                                                    
                                                    } else {
                                                        for (String c7 : c) {
                                                            String test7 = c1 + c2 + c3 + c4 + c5 + c6 + c7;
                                                            b = w.check(test7);
                                                            if (b == false) {
                                                                break;
                                                            }
                                                            test7 = SHA1(c1 + c2 + c3 + c4 + c5 + c6 + c7);
                                                            if (test7.equals(s)) {
                                                                System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6 + c7);
                                                                b = true;
                                                                break;
                                                            } else {
                                                                for (String c8 : c) {
                                                                    String test8 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
                                                                    b = w.check(test8);
                                                                    if (b == false) {
                                                                        break;
                                                                    }
                                                                    test8 = SHA1(c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8);
                                                                    if (test8.equals(s)) {
                                                                        System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8);
                                                                        b = true;
                                                                        break;
                                                                    } else {
                                                                        for (String c9 : c) {
                                                                            String test9 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
                                                                            b = w.check(test9);
                                                                            if (b == false) {
                                                                                break;
                                                                            }
                                                                            test9 = SHA1(c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9);
                                                                            if (test9.equals(s)) {
                                                                                System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9);
                                                                                b = true;
                                                                                break;
                                                                            } else {
                                                                                for (String c10 : c) {
                                                                                    String test10 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;
                                                                                    b = w.check(test10);
                                                                                    if (b == false) {
                                                                                        break;
                                                                                    }
                                                                                    test10 = SHA1(c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10);
                                                                                    if (test10.equals(s)) {
                                                                                        System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10);
                                                                                        b = true;
                                                                                        break;
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (b == false) {
            System.out.println("cant find solution");
        }
    }

    public boolean check(String s) {
        int[] d = new int[10];
        boolean t = true;
        for (int i = 0; i < s.length(); i++) {
            d[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        d[6] = (4 * d[0] + 10 * d[1] + 9 * d[2] + 2 * d[3] + d[4] + 7 * d[5]) % 11;
        d[7] = (7 * d[0] + 8 * d[1] + 7 * d[2] + d[3] + 9 * d[4] + 6 * d[5]) % 11;
        d[8] = (9 * d[0] + d[1] + 7 * d[2] + 8 * d[3] + 7 * d[4] + 7 * d[5]) % 11;
        d[9] = (d[0] + 2 * d[1] + 9 * d[2] + 10 * d[3] + 4 * d[4] + d[5]) % 11;
        for (int i = 6; i < d.length; i++) {
            if (d[i] >= 10) {
                t = false;
            }
        }
        return t;

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

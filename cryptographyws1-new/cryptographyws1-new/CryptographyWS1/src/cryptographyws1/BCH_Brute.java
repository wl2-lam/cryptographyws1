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
import java.util.Arrays;

/**
 *
 * @author wl2-lam
 */
public class BCH_Brute {

    /**
     * @param args the command line arguments
     * @throws java.security.NoSuchAlgorithmException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("please enter passsword");
        String s = "";
        String temp = "";
        BCH_Brute w = new BCH_Brute();
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        boolean b = false;
        String[] c = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",""};
        for (String c1 : c) {
            String test1 = "00000" + c1;
            temp = BCH_generator(test1);
            if (!"invaild".equals(temp)) {
                test1 = SHA1(temp);
                if (test1.equals(s)) {
                    System.out.println("The password is " + temp);
                    b = true;
                    break;
                }

            } else {
                for (String c2 : c) {
                    String test2 = "0000" + c1 + c2;
                    temp = BCH_generator(test2);
                    if (!"invaild".equals(temp)) {
                        test2 = SHA1(temp);
                        if (test2.equals(s)) {
                            System.out.println("The password is " + temp);
                            b = true;
                            break;
                        }

                    } else {
                        for (String c3 : c) {
                            String test3 = "000" + c1 + c2 + c3;
                            temp = BCH_generator(test3);
                            if (!"invaild".equals(temp)) {
                                test3 = SHA1(temp);
                                if (test3.equals(s)) {
                                    System.out.println("The password is " + temp);
                                    b = true;
                                    break;
                                }

                            } else {
                                for (String c4 : c) {
                                    String test4 = "00" + c1 + c2 + c3 + c4;
                                    temp = BCH_generator(test4);
                                    if (!"invaild".equals(temp)) {
                                        test4 = SHA1(temp);
                                        if (test4.equals(s)) {
                                            System.out.println("The password is " + temp);
                                            b = true;
                                            break;
                                        }

                                    } else {
                                        for (String c5 : c) {
                                            String test5 = "0" + c1 + c2 + c3 + c4 + c5;
                                            temp = BCH_generator(test5);
                                            if (!"invaild".equals(temp)) {
                                                test5 = SHA1(temp);
                                                if (test5.equals(s)) {
                                                    System.out.println("The password is " + temp);
                                                    b = true;
                                                    break;
                                                }

                                            } else {
                                                for (String c6 : c) {
                                                    String test6 = c1 + c2 + c3 + c4 + c5 + c6;
                                                    temp = BCH_generator(test6);
                                                    if (!"invaild".equals(temp)) {
                                                        test6 = SHA1(temp);
                                                        if (test6.equals(s)) {
                                                            System.out.println("The password is " + temp);
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
        StringBuilder buf = new StringBuilder();
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

    /**
     *
     * @param s
     * @return
     */
    public static String BCH_generator(String s) {
        int[] d = new int[10];
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            d[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        d[6] = (4 * d[0] + 10 * d[1] + 9 * d[2] + 2 * d[3] + d[4] + 7 * d[5]) % 11;
        d[7] = (7 * d[0] + 8 * d[1] + 7 * d[2] + d[3] + 9 * d[4] + 6 * d[5]) % 11;
        d[8] = (9 * d[0] + d[1] + 7 * d[2] + 8 * d[3] + 7 * d[4] + 7 * d[5]) % 11;
        d[9] = (d[0] + 2 * d[1] + 9 * d[2] + 10 * d[3] + 4 * d[4] + d[5]) % 11;
        for (int i = 6; i < d.length; i++) {
            if (d[i] >= 10) {
                flag = false;
                s = "invaild";

            }
        }
        if (flag == true) {
            s = Arrays.toString(d);
        }
        return s;
    }
}

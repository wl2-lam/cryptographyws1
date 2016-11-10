/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyws1;

import java.util.Scanner;

/**
 *
 * @author wl2-lam
 */
public class BCH_Brute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                                                            if (test5.equals(s)) {
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
                                                                    if (test5.equals(s)) {
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
                                                                            if (test5.equals(s)) {
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
                                                                                    if (test5.equals(s)) {
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
          if (b==false) {
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
}

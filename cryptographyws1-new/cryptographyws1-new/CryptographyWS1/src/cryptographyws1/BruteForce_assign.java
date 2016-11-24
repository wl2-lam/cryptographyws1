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
public class BruteForce_assign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter passsword");
        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        boolean b = false;
        String[] c = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",""};
        for (String c1 : c) {
            String test1 = c1;
            if (test1.equals(s)) {
                System.out.println("The password is " + c1);
                b = true;
                break;
            } else {
                for (String c2 : c) {
                    String test2 = c1 + c2;
                    if (test2.equals(s)) {
                        System.out.println("The password is " + c1 + c2);
                        b = true;
                        break;
                    } else {
                        for (String c3 : c) {
                            String test3 = c1 + c2 + c3;
                            if (test3.equals(s)) {
                                System.out.println("The password is " + c1 + c2 + c3);
                                b = true;
                                break;
                            } else {
                                for (String c4 : c) {
                                    String test4 = c1 + c2 + c3 + c4;
                                    if (test4.equals(s)) {
                                        System.out.println("The password is " + c1 + c2 + c3 + c4);
                                        b = true;
                                        break;
                                    } else {
                                        for (String c5 : c) {
                                            String test5 = c1 + c2 + c3 + c4 + c5;
                                            if (test5.equals(s)) {
                                                System.out.println("The password is " + c1 + c2 + c3 + c4 + c5);
                                                b = true;
                                                break;
                                            } else {
                                                for (String c6 : c) {
                                                    String test6 = c1 + c2 + c3 + c4 + c5 + c6;
                                                    if (test6.equals(s)) {
                                                        System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6);
                                                        b = true;
                                                        break;
//                                                    
                                                    } else {
                                                        for (String c7 : c) {
                                                            String test7 = c1 + c2 + c3 + c4 + c5 + c6 + c7;
                                                            if (test5.equals(s)) {
                                                                System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6 + c7);
                                                                b = true;
                                                                break;
                                                            } else {
                                                                for (String c8 : c) {
                                                                    String test8 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
                                                                    if (test5.equals(s)) {
                                                                        System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8);
                                                                        b = true;
                                                                        break;
                                                                    } else {
                                                                        for (String c9 : c) {
                                                                            String test9 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
                                                                            if (test5.equals(s)) {
                                                                                System.out.println("The password is " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9);
                                                                                b = true;
                                                                                break;
                                                                            } else {
                                                                                for (String c10 : c) {
                                                                                    String test10 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;
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
    }
}

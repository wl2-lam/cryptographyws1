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
public class BCH_correction {

    public void BCH_correction(String[] args) {
//        s = jTextField1.getText();
//        int s1, s2, s3, s4, s5, s6, k;
//        s1 = s2 = s3 = s4 = s5 = s6 = k = 0;
//        double p, q, r, j, a, b, f, c, e, g, n, m, h;
//        p = q = r = a = b = f = c = e = g = m = h = n = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            d[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
//        }
//        s1 = (d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9]) % 11;
//        s2 = ((d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8] + 10 * d[9]) % 11);
//        s3 = ((d[0] + 4 * d[1] + 9 * d[2] + 5 * d[3] + 3 * d[4] + 3 * d[5] + 5 * d[6] + 9 * d[7] + 4 * d[8] + d[9]) % 11);
//        s4 = ((d[0] + 8 * d[1] + 5 * d[2] + 9 * d[3] + 4 * d[4] + 7 * d[5] + 2 * d[6] + 6 * d[7] + 3 * d[8] + 10 * d[9]) % 11);
//        System.out.println(s1 + "" + s2 + "" + s3 + "" + s4);
//        if (s1 == 0 && s2 == 0 && s3 == 0 && s4 == 0) {
//            jTextArea1.setText("no error detect");
//        } else {
//
//            p = ((s2 * s2) - (s1 * s3));
//
//            p = p % 11;
//            if (0 > p) {
//                p = neg((int) p);
//            }
//            q = ((s1 * s4) - (s2 * s3));
//
//            q = q % 11;
//            if (0 > q) {
//                q = neg((int) q);
//            }
//            r = ((s3 * s3) - (s2 * s4));
//            r = r % 11;
//            if (0 > r) {
//                r = neg((int) r);
//            }
//            System.out.println(p + "," + q + "," + r);
//            if (p == 0 && q == 0 && r == 0) {
//                s5 = divide(s1);
//                s6 = ((s2 * s5) % 11);
//                if (s6 < 0) {
//                    jTextArea1.setText("more than 2 error detected");
//                }
//                d[s6 - 1] = d[s6 - 1] - s1;
//
//                jTextArea1.setText("single error detected with magniude of " + s1 + " in the digit " + s6 + "\nand the revisied number is " + d[0] + "" + d[1] + "" + d[2] + "" + d[3] + "" + d[4] + "" + d[5] + "" + d[6] + "" + d[7] + "" + d[8] + "" + d[9]);
//
//            } else {
//
//                k = (int) ((q * q) - (4 * p * r));
//                k = k % 11;
//                if (0 > k) {
//                    k = neg(k);
//                }
//                k = sqrt(k);
//                System.out.println(k);
//                if (k == 0) {
//                    jTextArea1.setText("more than 2 error detected");
//
//                } else {
//                    j = -q + k;
//                    if (j < 0) {
//                        j = neg((int) j);
//                    }
//                    a = (2 * p) % 11;
//                    if (a < 0) {
//                        a = neg((int) a);
//                    }
//                    a = divide((int) a);
//                    e = (a * j);
//                    e = e % 11;
//                    c = -q - k;
//                    if (c < 0) {
//                        c = neg((int) c);
//                    }
//
//                    g = (a * c);
//                    g = g % 11;
//                    m = e - g;
//                    if (0 > m) {
//                        m = neg((int) m);
//                    }
//
//                    n = divide((int) m);
//                    b = (e * s1) - s2;
//                    if (0 > b) {
//                        b = neg((int) b);
//                    }
//
//                    b = (b * n);
//                    b = b % 11;
//                    h = s1 - b;
//                    if (h < 0) {
//                        h = neg((int) h);
//                    }
//                    System.out.println(b);
//
//                    System.out.println(e + "," + g + "," + b + "," + h);
//                    int op = (int) e;
//                    int dp = (int) g;
//                    if (d[op - 1] > h) {
//                        d[op - 1] = d[op - 1] - (int) h;
//                    } else {
//                        d[op - 1] = (d[op - 1] + 11) - (int) h;
//                    }
//
//                    if (d[dp - 1] > b) {
//                        d[dp - 1] = d[dp - 1] - (int) b;
//                    } else {
//                        System.out.println(d[dp - 1]);
//                        d[dp - 1] = (d[dp - 1] + 11) - (int) b;
//                    }
//
//                    jTextArea1.setText("two error detected in prosition " + (int) e + " , " + (int) g + " with magnitude " + (int) h + " , " + (int) b + "\n the corrected number is" + d[0] + "" + d[1] + "" + d[2] + "" + d[3] + "" + d[4] + "" + d[5] + "" + d[6] + "" + d[7] + "" + d[8] + "" + d[9]);
//                }
//            }
//
//        }
//    }
//
//    public int neg(int i) {
//        int input = i;
//        switch (input) {
//            case -1:
//                return 10;
//            case -2:
//                return 9;
//            case -3:
//                return 8;
//            case -4:
//                return 7;
//            case -5:
//                return 6;
//            case -6:
//                return 5;
//            case -7:
//                return 4;
//            case -8:
//                return 3;
//            case -9:
//                return 2;
//            case -10:
//                return 1;
//            default:
//                return 0;
//        }
//    }
//
//    public int square(int i) {
//        int input = i;
//        switch (input) {
//            case 1:
//                return 1;
//            case 2:
//                return 4;
//            case 3:
//                return 9;
//            case 4:
//                return 5;
//            case 5:
//                return 3;
//            case 6:
//                return 3;
//            case 7:
//                return 5;
//            case 8:
//                return 9;
//            case 9:
//                return 4;
//            case 10:
//                return 1;
//            default:
//                return 0;
//        }
//    }
//
//    public int divide(int i) {
//        int input = i;
//        switch (input) {
//            case 1:
//                return 1;
//            case 2:
//                return 6;
//            case 3:
//                return 4;
//            case 4:
//                return 3;
//            case 5:
//                return 9;
//            case 6:
//                return 2;
//            case 7:
//                return 8;
//            case 8:
//                return 7;
//            case 9:
//                return 5;
//            case 10:
//                return 10;
//            default:
//                return 0;
//        }
//
//    }
//
//    public int sqrt(int i) {
//        int input = i;
//        switch (input) {
//            case 1:
//                return 1;
//
//            case 3:
//                return 5;
//            case 4:
//                return 2;
//            case 5:
//                return 4;
//
//            case 9:
//                return 3;
//
//            default:
//                return 0;
//        }
//    }
//    private static String s = "";
//    private final int[] d = new int[16];
}
}

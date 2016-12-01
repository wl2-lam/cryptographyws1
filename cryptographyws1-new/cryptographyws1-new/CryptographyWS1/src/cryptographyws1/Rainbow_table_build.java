/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyws1;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wl2-lam
 */
public class Rainbow_table_build {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//        Rainbow_table_build foo = new Rainbow_table_build();
//        int i =0;
//        String[][] table= new String[100][100];
//       table= foo.generate(i);
//
//    }
    public static int count;
    public static int passwordsize;
    public String[][] generate(int table_size,int num) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        
        
        
        String[][] table = new String[table_size][2];
        
        String temp = "";
        for (int i = 0; i < table.length; i++) {
            table[i][0] = randomWord(num);
            table[i][1]=generateChain(table[i][0]);

        }
        
        return table;
 

    }
     private String generateChain(String start) {
        String pass = start;
        String hash;
        String pass1="";
        String hash1;

        for (int i = 0; i < 100; i++) {
            hash = SHA1.encode(pass.getBytes());
            pass = reduction1(hash,i);
//            hash1=SHA1.encode(pass.getBytes());
//            pass1= reduction2(hash1);
        }

        return pass;
    }
     public void SetPasswordSpace(int size){
         passwordsize=size;
     }

    public String reduction1(String s,int p) {
        int result = 0;
        int base = 0;
        int remain = 0;
        p=p+1;
        String finalresult = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int j = (int) c;
            result += (1+i)*c;
        }        
        result=result*p;        
        while (result > 0) {
            remain = result % 26;
            String c = NumToApl(remain);
            finalresult = c + finalresult;
            result = result / 26;
        }

        return finalresult;
    }
    public String reduction2(String s){
        int result = 0;
        int base = 26;
        int remain = 0;        
        String finalresult = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int j = (int) c;
            result += c;
        }
        while (result > 0) {
            remain = result % base;
            result=result/base;
            finalresult = NumToApl(remain)+finalresult;
            result=result-1;
        }
        
        return finalresult;
    }

    public String NumToApl(int i) {
        String result = "";
        switch (i) {
            case 1:
                result = "a";
                break;
            case 2:
                result = "b";
                break;
            case 3:
                result = "c";
                break;
            case 4:
                result = "d";
                break;
            case 5:
                result = "e";
                break;
            case 6:
                result = "f";
                break;
            case 7:
                result = "g";
                break;
            case 8:
                result = "h";
                break;
            case 9:
                result = "i";
                break;
            case 10:
                result = "j";
                break;
            case 11:
                result = "k";
                break;
            case 12:
                result = "l";
                break;
            case 13:
                result = "m";
                break;
            case 14:
                result = "n";
                break;
            case 15:
                result = "o";
                break;
            case 16:
                result = "p";
                break;
            case 17:
                result = "q";
                break;
            case 18:
                result = "r";
                break;
            case 19:
                result = "s";
                break;
            case 20:
                result = "t";
                break;
            case 21:
                result = "u";
                break;
            case 22:
                result = "v";
                break;
            case 23:
                result = "w";
                break;
            case 24:
                result = "x";
                break;
            case 25:
                result = "y";
                break;
            case 26:
                result = "z";
                break;
        }
        return result;
    }

    public static String randomWord(int length) {
        Random random = new Random();
        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            word.append((char) ('a' + random.nextInt(26)));
        }

        return word.toString();
    }

    private String AplaphetSet = "abcdefghijklmnopqrstuvwxyz";

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

    public static String shortHash(String sha) {
        return Integer.toString(sha.hashCode() & 0x7FFFFFFF, 36).substring(0, 4);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyws1;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.lang.AbstractMethodError.*;
import java.io.*;

/**
 *
 * @author wl2-lam
 */
public class Rainbow_table_build {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Rainbow_table_build foo = new Rainbow_table_build();
        foo.build();

    }

    public void build() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String s= "aaaaaa";
        int count=0;
        int i ;
        String s1[] = new String[10000];
        String left[]= new String[10000];
        String right[]= new String[10000];
        left[0] = "aaaaaa";
        s1[0]="aaaaaa";
        for(int g =0;g<100;g++){
            System.out.println("4");
        for ( i = 0; i < 10; i++) {
            while (g<99){
            s1[i+1]=SHA1(left[g]);
            s1[i+1]=shortHash(s1[i+1]);       
            if (i==9&&g<9999) {
                left[g+1]=s1[i+1];
                System.out.println("4");
            }
            }
            
        }

        }
        for (String left1 : left) {
            System.out.println(left1);
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
public static String shortHash(String sha) {
    return Integer.toString(sha.hashCode() & 0x7FFFFFFF, 36).substring(0, 3);
}

}

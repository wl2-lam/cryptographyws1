/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyws1;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

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
        foo.generate();

    }

    public void generate() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String[] table = new String[1000];
        String[] temp = new String[12];
        temp[0] = "aaaa";
        table[0] = "aaaa";
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                temp[j] = SHA1(table[i]);
                if (j + 1 < temp.length) {
                    temp[j + 1] = shortHash(temp[j]);
                }
                j++;

            }
            if (i + 2 < 1000) {
                table[i + 1] = temp[10];
                table[i+2]=shortHash(temp[10]);
                i++;
                

            }

        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);

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
    return Integer.toString(sha.hashCode() & 0x7FFFFFFF, 36).substring(0, 4);
}
}

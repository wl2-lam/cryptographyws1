
import java.util.ArrayList;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wl2-lam
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Url;
        Scanner sc = new Scanner(System.in);
        Url = sc.next();
        KnownSites s = new KnownSites();
        boolean f = s.isKnown(Url);
        if (f == true) {
            System.out.println("good");
        }
    }
}
    

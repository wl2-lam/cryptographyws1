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
import java.util.*;

public class method1 {

    public static void main(String[] args) {
        int result = 0;
        int result1=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first letter");
        int dig1 = sc.nextInt();
        System.out.println("please enter the second letter");
        int dig2 = sc.nextInt();
        System.out.println("please enter operation you need");
        String operator = sc.next();
        switch (operator) {
            case "+":
                result = ((dig1) + (dig2)) % 11;
                result=result1;
                System.out.println("the result is " + result);
                break;

            case "*":
                result1 = (dig1 * dig2);
                result=result1%11;
                if (result1<0) {
                    result+=11;
                }
                System.out.println("the result is " + result);
                break;

            case "/":
                BCH_correction c = new BCH_correction();
                int division=c.inverse(dig1,dig2);
                System.out.println(division);
                result=division%11;
                System.out.println("the result is "+ result);
                break;
        }

        
        

    }
   
}



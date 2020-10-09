/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicproblemsolving;

/**
 *
 * @author Pritam
 */
import java.util.*;
public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
       int val=0;
        String s = n+"";
        for(int i=0;i<s.length();i++)
        {
            val = n%10;
            System.out.println(val);
            n = n/10;
        }
    }
}

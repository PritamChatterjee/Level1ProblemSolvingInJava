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
public class PrintLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0; i< s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}

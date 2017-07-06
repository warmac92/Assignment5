/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String sample; int c=0;
        Scanner sn = new Scanner(System.in);
        do{
        c=0;
        System.out.print("Please enter a string: ");
        sample = sn.nextLine();
        if(sample.length()<7)
        {
            c=1;
            System.out.println("Please enter string with at least 7 characters...");
            
        }
        }while(c==1);
        
        char ch1 = sample.charAt(1);
        char ch2 = sample.charAt(2);
        char ch6 = sample.charAt(6);
        System.out.println("charAt(1):"+ch1+" charAt(2):"+ch2+" charAt(6):"+ch6);
        System.out.print("Replacing  charAt(1) and charAt(2) by charAt(6): ");
        sample = sample.replace(ch1,ch6);
        sample = sample.replace(ch2,ch6);
        System.out.print(sample + "\n");
        System.out.println("Concatenating the resultant string with words new:"+ (sample.concat("new")));
       

    
}

}
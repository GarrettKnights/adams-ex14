/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise14;

import java.util.*;

public class Solution14 {
    public static void main(String[] args) {

        //Declares variables we will be using
        double tax;
        double amount;
        String state;
        double FinalT;
        double tax2 = 0;

        //Initializes Scanner
        Scanner ScanWord = new Scanner(System.in);

        // Ask user to enter order amount
        System.out.println("What is the order amount? ");
        amount = ScanWord.nextDouble();

        // Ask user to enter the state.
        System.out.println("What is the state? ");
        state = ScanWord.next();

        //Sets tax to 0
        tax = 0;

        //If state is WI
        if(state.equalsIgnoreCase("WI")) {
            //Sets Tax
            tax = 0.055 * amount;
            tax2 = Math.ceil(tax * 100.0) / 100.0;
            //Prints out subtotal and tax if state is WI
            double amount2 = Math.ceil(amount * 100.0) / 100.0;
            System.out.println("The subtotal is $" + amount2);
            System.out.println("The tax is $" + tax2);
        }

        //Adds the tax to amount... if state not WI tax is 0
        FinalT = tax2 + amount;
        double FinalT2 = Math.ceil(FinalT * 100.0) / 100.0;

        //Prints total
        System.out.println("The total is $" + FinalT2);


    }
}




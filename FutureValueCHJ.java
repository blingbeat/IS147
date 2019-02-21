import java.util.Scanner;

import javafx.scene.shape.ClosePath;

/* 
Write a program that reads in investment amount, annual interest rate, and number of
years, and displays the future investment value 
Chintan Himanshu Jani 02/06/2019
*/

public class FutureValueCHJ {
    public static void main (String [] args){

        //get an input from the user.
            Scanner input = new Scanner(System.in);

        //ignore
            System.out.println("");

        // user's investment amount
            System.out.print ("Enter Investment value: ");
            double amount = input.nextDouble();

        //user's interest rate    
            System.out.print ("Enter Interest Rate: ");
            double monthlyInterestRate = input.nextDouble()/(12*100);

       //total investment years
         System.out.print ("Enter Amount of Years: ");
            int years = input.nextInt();

        //Calculate
            double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);

        //Display Result
        System.out.println("Your Accumulated Value is $" + futureInvestmentValue);

        //ignore
        System.out.println("");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interestrate;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class InterestRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    DecimalFormat PricePattern = new DecimalFormat("$#0.00");
    NumberFormat PercentFormat = NumberFormat.getPercentInstance();
    
    Scanner scan = new Scanner ( System.in );
    
    System.out.print (" Enter the investment > " );
    double investment = scan.nextDouble();
    
    System.out.print (" Your interest rate is > ");
    double interestRate = scan.nextDouble();
    
    System.out.print ( "With an investment of " + PricePattern.format(investment) 
                        + " at an interest rate of " + PercentFormat.format(interestRate) + "\n");
    
    double futureValue1 = (investment * (Math.pow(1 + interestRate, 5)));
    double futureValue2 = (investment * (Math.pow(1 + interestRate, 10)));
    double futureValue3 = (investment * (Math.pow(1 + interestRate, 20)));
    System.out.println("The future value in 5 years is " + PricePattern.format(futureValue1) + "\n" 
                         + " The future value in 10 years is " + PricePattern.format(futureValue2) + "\n"
                         + " The future value in 20 years is " + PricePattern.format(futureValue3));
    }
    
}

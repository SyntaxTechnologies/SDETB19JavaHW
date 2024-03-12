package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Do you need a loan? (true/false)");
    // System.out.println("What is your credit score?");
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

        boolean loan=scan.nextBoolean();

        if(loan){
           // System.out.println("Do you need a loan?");

           // System.out.println( "What is your credit score?");
            int creditScore=scan.nextInt();

               if(creditScore<600){
                System.out.println("The eligibility is Not eligible");

            } else if (creditScore>=600 && creditScore<=700) {
                System.out.println("The eligibility is Maybe eligible");

            }else if (creditScore>700 && creditScore<800){
                System.out.println("The eligibility is Eligible");
            }else {
                System.out.println("The eligibility is Definitely eligible");

            }


        }else  {
            System.out.println("The eligibility is Unknown");
        }







    }
}

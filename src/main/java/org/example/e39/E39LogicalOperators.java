package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test
    //System.out.println("Please enter your mark");
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //System.out.println("Please enter your mark");
        double mark=scan.nextDouble();
        if(mark>=1 && mark<25){
            System.out.println("Your grade is F");

          } else if (mark>=25 && mark<45) {
            System.out.println("Your grade is E");

          } else if (mark>=45 && mark<50) {
            System.out.println("Your grade is D");

          } else if (mark>=50 && mark<60) {
            System.out.println("Your grade is C");

          } else if (mark>=60 && mark<=80) {
            System.out.println("Your grade is B");

          } else if (mark>80 ) {
            System.out.println("Your grade is A");

        }else {
            System.out.println("Please enter valid mark");
        }


    }
}

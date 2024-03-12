package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Are you thirsty?");
    // System.out.println("Are you sleepy?");

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean thirsty=scan.nextBoolean();
        boolean sleepy=scan.nextBoolean();

        if(thirsty & !sleepy){
            System.out.println("Looks like you need to drink water");

          } else if (thirsty && sleepy) {
            System.out.println("Looks like you need to drink coffee");

          } else if (! thirsty && ! sleepy) {
            System.out.println("Looks like you need to drink nothing");

        }else {
            System.out.println("Looks like you need to drink tea");
        }

    }

}

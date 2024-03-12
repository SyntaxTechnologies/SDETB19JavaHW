package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Please enter two strings");
    //System.out.println("Please enter two numbers");
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       // System.out.println("Please enter two strings");
        String word1=scan.nextLine();
        String word2=scan.nextLine();
       // System.out.println("Please enter two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        if(num1==num2 && word1.equals(word2)) {
            System.out.println("AND");
        }else if (num1==num2 || word1==word2 ) {
                System.out.println("OR");

            } else if (num1!=num2 && !word1.equals(word2)) {
                System.out.println("NONE");
            }
        }

    }


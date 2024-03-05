package org.example.e27;


import java.util.Scanner;

public class E27ScannerClass {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Please enter your age");
        int ages = age.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if (ages>=18){
            System.out.println("You eligible to vote");
        }else {
            System.out.println("You not eligible to vote");
        }

    }
}


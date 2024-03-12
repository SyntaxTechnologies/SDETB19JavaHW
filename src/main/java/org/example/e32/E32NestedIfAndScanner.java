package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender=scan.next().charAt(0);

        System.out.println("Please enter your age");
        int age=scan.nextInt();

        if(gender=='M' && age>25){
            System.out.println("Man");

        } else if (gender=='M' && age<25 ) {
            System.out.println("boy");
        } else if (gender=='F' && age>25) {
            System.out.println("Women");
        }else{
            System.out.println("Girl");
        }

        }

    }




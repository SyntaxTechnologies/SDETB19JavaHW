package org.example.e29;


import java.util.Scanner;

public class E29ScannerClass {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Please enter first number");
        double x=value.nextDouble();
        System.out.println("Please enter second number");
        double y=value.nextDouble();

        if(x*y>0){
            System.out.println("true");
        } else  {
            System.out.println("false");

        }

        }

    }

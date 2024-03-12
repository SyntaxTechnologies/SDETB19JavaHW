package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("Value is even");
        }if(num>1000){
            System.out.println("even number is large");

            }if(num%2==0 && num<1000){
        System.out.println("Even value is just right");}
        else if(num % 2 != 0){
           System.out.println("Value is odd");
        }
        if(num>1000) {
            System.out.println("Odd value is large");
        }else if(num<1000 && num%2!=0) {
            System.out.println("odd value is just right");
        }
        }}







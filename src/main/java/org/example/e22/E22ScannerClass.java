package org.example.e22;

import java.util.Scanner;

public class E22ScannerClass {
    public static void main(String[] args) {
        /*  Write a program to take username, age and mobile number
First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String username=scan.nextLine();
        System.out.println("Enter your mobile number");
        String mobilenumber=scan.nextLine();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Your name is" +" "+ username +", your age is"+" " +age +" "+ "and your mobile number is"+" " + mobilenumber);




    }
}

package org.example.e20;

import java.util.Scanner;

public class E20ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstname = input.next();
        System.out.println("Please enter your last name");
        String Lastname = input.next();
        System.out.println(firstname + " "+ Lastname);


    }
}

package org.example.e23;

import java.util.Scanner;

public class E23ScannerClass {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean value = user.nextBoolean();
        if (value) {
            System.out.println("The value is " + value);
        } else {
            System.out.println("The value is " + value);
        }
    }
}

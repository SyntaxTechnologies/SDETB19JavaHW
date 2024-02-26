package org.example.e20;

import java.util.Scanner;

public class E20ScannerClass {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please Enter First Name");
        String firstName = user.nextLine();
        System.out.println("Please Enter Last Name");
        String lastName = user.nextLine();
        System.out.print(firstName + " " + lastName);
    }
}

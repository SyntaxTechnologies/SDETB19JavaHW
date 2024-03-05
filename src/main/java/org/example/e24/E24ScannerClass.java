package org.example.e24;

import java.util.Scanner;

public class E24ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello please enter your name");
        String name = input.next();
        System.out.println("Your name is "+name);

    }
}

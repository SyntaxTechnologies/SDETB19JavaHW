package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter weather");
        int temp = input.nextInt();
        boolean isSunny=true;

        if (temp>85){
            System.out.println("");
        }


    }
}

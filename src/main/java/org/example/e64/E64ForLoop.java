package org.example.e64;

import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Int:");
        int end= inp.nextInt();

        //write your code below
        for (int i = 0; i < end * 2; i++) {
            System.out.print(i + " ");
        }

    }
}

package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();

      //  System.out.println("int"+" "+x);
        for (int i=x-1; i>=0;i--){
            System.out.print(i+" ");
        }

    }
}

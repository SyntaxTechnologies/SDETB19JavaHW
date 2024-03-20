package org.example.e72;

import java.lang.reflect.Array;
import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] days=new String[7];
        days[0]="Sunday";
        days[1]="Monday";
        days[2]="Tuesday";
        days[3]="wednesday";
        days[4]="Thursday";
        days[5]="friday";
        days[6]="Saturday";
       for (int i=0;i<days.length;i++){
           System.out.println("Please enter day"+" "+(i+1)+" " + "of the week");
           String day=scanner.nextLine();

       }
       for (int i=0;i<days.length;i++){
           System.out.println(days[i]);
       }


    }
}


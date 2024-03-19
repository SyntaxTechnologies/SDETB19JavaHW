package org.example.JavaHomeWork;

public class Task5 {
    public static void main(String[] args) {
        int i=3;
        int j=5;

        i=+j;
        j=i-j;
        i=-j;
        System.out.println("The swap value of number 1 is now:" +i);
        System.out.println("The swap value of number 2 is now:" +j);
    }
}

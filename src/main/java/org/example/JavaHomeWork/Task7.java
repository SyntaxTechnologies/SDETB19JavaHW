package org.example.JavaHomeWork;

public class Task7 {
    public static void main(String[] args) {
        int a =0;
        int b =2;
        int c =5;

        for (int i=0;i<=10;i++){
            a=b+c;
            c=b;
            b=a;
            System.out.println(a +" ");
        }

    }
}

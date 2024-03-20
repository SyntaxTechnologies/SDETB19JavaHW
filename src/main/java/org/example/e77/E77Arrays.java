package org.example.e77;

public class E77Arrays {
    public static void main(int[] args) {
        //write code from here
        int[] numbers={5,4,8};
        int max=numbers[0];
        for (int n:numbers){
            if (max<n){
                max=n;
            }
            System.out.print(max);
        }

    }
}
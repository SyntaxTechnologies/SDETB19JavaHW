package org.example.JavaHomeWork;

public class Task8 {
    public static void main(String[] args) {
        int []number = {30,23,33,22,45,12,90};

        int max=number[0];
        int min=number[0];

        for(int i=0;i<number.length;i++){
            if (number[i]>max){
                max=number[i];
            } else if (number[i]<min) {
                min=number[i];
            }

        }
        System.out.println("Max number :" +max);
        System.out.println("Min number :" +min);
        }
    }


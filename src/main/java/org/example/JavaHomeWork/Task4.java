package org.example.JavaHomeWork;

public class Task4 {
    public static void main(String[] args) {
        int [][] num ={
                {10,30,40,34},
                {45,2,56,10},
                {30,40,21,55},
        };

        int sumE=0;
        int sumO=0;
        for (int i =0;i<num.length;i++){
            for (int j=0;j<num.length;j++){
                if (num[i][j]%2==0){
                    sumE=sumE+num[i][j];
                }else {
                    sumO=sumO+num[i][j];
                }
            }
            System.out.print("Sum of odd numbers is "+sumO);
            System.out.print("Sum of odd numbers is "+sumE);
        }
    }
}

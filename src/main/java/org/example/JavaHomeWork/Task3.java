package org.example.JavaHomeWork;

public class Task3 {
    public static void main(String[] args) {
        int [][] num ={
                {10,30,40,34},
                {45,2,56,10},
                {30,40,21,55},
        };
        for (int row=0;row<num.length;row++){
            for (int col=0;col<num.length;col++){
                if (num[row][col]%2==0){
                    System.out.print(num[row][col]+ " ");

                }
            }
        }
    }
}

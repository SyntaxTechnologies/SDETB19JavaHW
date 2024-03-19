package org.example.JavaHomeWork;

public class Task1 {
    public static void main(String[] args) {
        int[] temperature= {35,21,42,12,33,25,22};
        int highest = temperature[0];
        int lowest = temperature[0];

        for (int temp :temperature){
            if (highest<temp){
                highest=temp;
            }else if (lowest>temp){
                lowest=temp;
            }

        }
        System.out.println("Highest temperature of the week is "+ highest);
        System.out.println("Lowest temperature of the week is "+ lowest);
    }
}

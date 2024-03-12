package org.example.e13;

import java.util.Set;

public class E13AirthmeticOperations {
    public static void main(String[] args) {


        int myNumber=7;
        int stepOne= myNumber*myNumber;
        int stepTwo= stepOne+myNumber;
        int stepThree= stepTwo/myNumber;

        int stepFour= stepThree+17;
        int stepFive= stepFour-myNumber;
        int stepSix= stepFive/6;
        System.out.println("The magic number is" +" "+stepSix+"!");


    }
}

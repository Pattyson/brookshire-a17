/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution17 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        double Bac, A, W, r, H;
        int sex;

        System.out.println("Enter a 2 if you are male or a 1 if you are a female.");
        sex = input.nextInt();

        System.out.println("How many ounces of alcohol did you have?");
        A = input.nextDouble();

        System.out.println("What is your weight, in pounds?");
        W = input.nextDouble();

        System.out.println("How many hours has it been since your last drink?");
        H = input.nextDouble();

        if(sex == 1)
            r = 0.63;
        else
            r = 0.73;

        Bac = (A * 5.14 / W * r) - (0.015 * H) ;

        System.out.println("You BAC is " + Bac);

        if(Bac >= 0.08)
            System.out.println("It is not legal for you to drive.");
        else
            System.out.println("It is legal for you to drive.");

    }

}

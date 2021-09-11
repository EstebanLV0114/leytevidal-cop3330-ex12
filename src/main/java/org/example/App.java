package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main(String[] args)
    {
        //initialize scanner
        Scanner input = new Scanner(System.in);

        //variables
        int p;
        double rate;
        double nRate;
        int yrs;

        //inputs and calculation
        System.out.println("Enter the principal: ");
        p = input.nextInt();
        System.out.println("Enter the rate of interest:");
        rate = input.nextDouble();
        nRate = rate / 100;
        System.out.println("Enter the number of years: ");
        yrs = input.nextInt();

        //output
        System.out.println("After " + yrs + " years at " + rate + "%, the investment will be worth $" + (p * (1 + nRate * yrs)) + ".");
    }
}

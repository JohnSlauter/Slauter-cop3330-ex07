package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{

    static final double feetsq_to_metersq_const = 0.09290304;

    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        int length, width, area_feet;

        double area_meter;

        String temp;

        System.out.print("What is the length of the room in feet? ");

        temp = s.nextLine();

        length = String_to_int(temp);

        System.out.print("What is the width of the room in feet? ");

        temp = s.nextLine();

        width = String_to_int(temp);

        System.out.print("You entered dimensions of " + length + " by " + width + " feet.");

        area_feet = length*width;

        area_meter = area_feet * feetsq_to_metersq_const;

        System.out.print("\nThe area is\n" + area_feet + " square feet\n" + area_meter + " square meters");

        s.close();

    }

    private static int String_to_int(String s){

        int res = 0;

        for(int i = 0; i < s.length(); i++){

            res += (s.charAt(i)-'0')*pow(10, s.length()-1-i);

        }

        return res;

    }

    private static int pow(int base, int exponent){

        int res = 1;

        for(int i = 0; i < exponent; i++){

            res *= base;

        }

        return res;

    }

}

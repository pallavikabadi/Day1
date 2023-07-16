package com.bridgelabz;

import java.util.Scanner;
//Write a LeapYear.java program
// that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter Year:");
        Scanner sc=new Scanner(System.in);
        year =sc.nextInt();

        if(year%400==0){
            System.out.println("Year is leap year");
        } else if (year%100==0) {
            System.out.println("Year is not leap year");
        } else if (year%4==0) {
            System.out.println("Year is leap year");
        }else {
            System.out.println("Year is not leap year");
        }
    }
}

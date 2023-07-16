package com.bridgelabz;
//Write a program to demonstrate static variables, methods, and blocks.
public class StaticKeyword {
    String EmployeeName;
    static String company="TCS";

    static void Example(){
        System.out.println("Static Method");

    }
    static{
        //always Execute before main method
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Example();
    }
}

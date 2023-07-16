package com.bridgelabz;
//Write a program to check two strings are equal or not.
public class CheckStringEquality {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str3="Java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1==str2);
        System.out.println(str1==str3);
    }
}

package com.bridgelabz;
//To find the sum of command-line arguments and count the invalid integers entered.
public class FindSumCommandLineArg {
    public static void main(String[] args) {
        int x;
        int y;
        int sum;
        try {
            x = Integer.parseInt(args[0]); //first arguments
            y = Integer.parseInt(args[1]); //second arguments
            sum = x + y;
            System.out.println("The sum of x and y is: " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
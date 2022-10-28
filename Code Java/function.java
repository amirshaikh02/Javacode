package com.amir;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        // take input of 2 number and print the sum
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number 2:: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum Of Number: "+ sum);

    }

}

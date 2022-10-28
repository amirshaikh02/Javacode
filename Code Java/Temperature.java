package com.amir;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please Enter a Temperature: ");
        float temC= sc.nextFloat();
        float tempF=(temC*9/5)+32;
        System.out.println(tempF);

        //java Basic
        //for loop

        for (int count = 1; count !=5; count++)
        {
            System.out.println(count);
        }

        //while loop
        int count = 1;
        while(count != 5)
        {
            System.out.println(count);
            count++;
        }

    }
}

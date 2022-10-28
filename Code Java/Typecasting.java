package com.amir;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //float num= sc.nextFloat();
        //System.out.println(num);

        ///type casting
        int n=(int) (44.57);
        System.out.println(n);

        //Automatic type promotion expression
        int a= 257;
        byte b=(byte)(a);
        System.out.println(b);

        int number='a';
        System.out.println(number);
    }
}

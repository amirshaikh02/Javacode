package com.fun;

import java.util.Scanner;

public class Main {

//      SYNTAX
//     return-type name (argument){
//            body
//          return statement;
//     }

    public static void main(String[] args) {
        // write your code here
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(10,40);
        System.out.println(ans);

    }
        static int sum3(int a,int b){
        int sum = a+b;
        return sum;

        }

        static int sum2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter a Number 2: ");
            int num2 = sc.nextInt();
            int addition = num1 + num2;
            return addition;
        }

        static void sum(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number 1: ");
            int num1= sc.nextInt();
            System.out.println("Enter a Number 2: ");
            int num2= sc.nextInt();
            int addition = num1+num2;
            System.out.println("Sum is: "+ addition);

        }

    }
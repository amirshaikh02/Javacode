package com.amir;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Q.Find the Largest of a 3 number
//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);
        int max;
        if (a<b){
            max=b;
        }else {
            max=a;
        }
        if (max<c){
            max=c;
        }
        System.out.println(max);
    }
}

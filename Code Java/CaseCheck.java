package com.amir;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Something Write here");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(2);
//        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z' ){
            System.out.println("LowerCase");
        }else {
            System.out.println("UpperCase");
        }
    }
}

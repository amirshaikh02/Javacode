package com.fun;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Welcome to the fuel, pune");
        System.out.println("Total Number of Token : "+ st.countTokens());
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }

    }
}

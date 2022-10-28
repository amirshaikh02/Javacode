package com.fun;

public class StringSplitTokenizer {
    public static void main(String[] args) {
        System.out.println("first Split Tokenizer");
        String str1 = "impossible nahi possible hai";
        String str2 = "Himmat hai toh pakad ke dikha";
        String delim = "i";

        String arr[] = str2.split(delim);
        for (String unique:arr){
            System.out.println(unique);
        }
    }
}

package com.fun;

import java.io.*;
import java.util.*;

public class Project {
    public static void main(String[] args) {

        StudentDemo s = new StudentDemo();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roll no: ");
        s.roll = sc.nextInt();

        System.out.println("Enter a First Name: ");
        s.fname= sc.next();

        System.out.println("Enter a Last Name: ");
        s.lname= sc.next();

        System.out.println("Enter a Address:");
        s.address= sc.next();

        System.out.println("Enter a Mobile Number: ");
        s.mobile = sc.next();

        System.out.println("Enter a Percentage:");
        s.per =sc.nextDouble();


        try {

            FileOutputStream fos = new FileOutputStream("f:\\test.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            fos.close();
            oos.close();
            System.out.println("Serialization has saved");
        }catch (Exception io){
            //io.printStackTrace();
        }


    }
}

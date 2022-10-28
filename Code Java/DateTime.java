package com.fun;
import java.util.*;
import java.text.*;
public class DateTime {
    public static void main(String[] args) {
        Date date1=new Date();
        Date date2=new Date(153536374L);
        Date date3=new Date(65555776865L);

        System.out.println("our first date is:"+date1) ;
        System.out.println("our second date is:"+date2) ;
        System.out.println("our third date is:"+date3) ;

        if(date1.after(date2)){
            System.out.println("Date 1 After date 2");

        }
        if (date2.before(date3)) {
            System.out.println("date 2 after date 3");
        }
        date2.setTime(date2.getTime()+date3.getTime());
        System.out.println("Date 2 time set"+date2);

    }

}
